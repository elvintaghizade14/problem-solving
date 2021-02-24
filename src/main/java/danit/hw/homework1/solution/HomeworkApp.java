package danit.hw.homework1.solution;

import danit.hw.homework1.solution.io.LinuxConsoleImpl;
import danit.hw.homework1.solution.util.RandomGenerator;
import danit.hw.homework1.solution.util.TypeConverter;

import java.util.Scanner;

public class HomeworkApp {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final LinuxConsoleImpl console = new LinuxConsoleImpl(scanner);

    final int randomNumber = RandomGenerator.generateNumber(0, 100);
    final String name = console.readLn("Please, enter your name: ");
    console.printLn("Let the game begin!");

    int guessedNumber = -1;



  }
}