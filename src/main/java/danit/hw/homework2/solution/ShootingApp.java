package danit.hw.homework2.solution;

import danit.hw.homework1.solution.io.Console;
import danit.hw.homework1.solution.io.LinuxConsoleImpl;
import danit.hw.homework1.solution.util.RandomGenerator;
import danit.hw.homework1.solution.util.TypeConverter;

import java.util.Arrays;
import java.util.Scanner;

public class ShootingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinuxConsoleImpl console = new LinuxConsoleImpl(scanner);

        char[][] board = getBoard();
        final Cell targetCell = setTarget();
        console.printLn(targetCell.toString());
        console.printLn("All set. Get ready to rumble!");
        showBoard(board, console);

        while (true) {
            Cell shotCell = getShotCell(console);
            if (!shotCell.equals(targetCell)) {
                board[shotCell.row][shotCell.column] = '*';
            } else {
                board[shotCell.row][shotCell.column] = 'x';
                console.printLn("You have won!");
                showBoard(board, console);
                break;
            }
        }
    }

    private static char[][] getBoard() {
        return new char[][]
                {
                        {' ', '1', '2', '3', '4', '5'},
                        {'1', '-', '-', '-', '-', '-'},
                        {'2', '-', '-', '-', '-', '-'},
                        {'3', '-', '-', '-', '-', '-'},
                        {'4', '-', '-', '-', '-', '-'},
                        {'5', '-', '-', '-', '-', '-'}
                };
    }

    private static Cell setTarget() {
        return new Cell(
                RandomGenerator.generateNumber(1, 5),
                RandomGenerator.generateNumber(1, 5)
        );
    }

    private static int getNumber(final Console console, final String dimension) {
        while (true) {
            final String line = console.readLn(String.format("Enter %s number: ", dimension));
            try {
                final int num = TypeConverter.strToInt(line);
                if (num < 1 || num > 5) throw new IllegalArgumentException();
                return num;
            } catch (NumberFormatException e) {
                console.printLn(String.format("Your input: '%s' is invalid. Please, try again.", line));
            } catch (IllegalArgumentException e) {
                console.printLn(String.format("Input: '%s' is out of bound: [1, 5]", line));
            }
        }
    }

    private static Cell getShotCell(final Console console) {
        return new Cell(
                getNumber(console, "row"),
                getNumber(console, "column")
        );
    }

    private static void showBoard(final char[][] board, final Console console) {
        for (char[] row : board) {
            console.print("| ");
            for (char cell : row) {
                console.print(cell);
                console.print(' ');
            }
            console.printLn('|');
        }
    }

}