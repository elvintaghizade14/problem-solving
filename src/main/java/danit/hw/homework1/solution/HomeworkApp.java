package danit.hw.homework1.solution;

import danit.hw.homework1.solution.io.Console;
import danit.hw.homework1.solution.io.LinuxConsoleImpl;
import danit.hw.homework1.solution.util.RandomGenerator;
import danit.hw.homework1.solution.util.TypeConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkApp {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final LinuxConsoleImpl console = new LinuxConsoleImpl(scanner);

    final int randomNumber = RandomGenerator.generateNumber(0, 100);
    final String name = console.readLn("Please, enter your name: ");
    console.printLn("Let the game begin!");

    final List<Integer> enteredValues = new ArrayList<>();

    while (true) {
      int guessedNumber = getGuessedNumber(console);
      enteredValues.add(guessedNumber);

      if (guessedNumber > randomNumber) console.printLn("Your number is too big. Please, try again.");
      else if (guessedNumber < randomNumber) console.printLn("Your number is too small. Please, try again.");
      else {
        console.printLn(String.format("Congratulations, %s!", name));
        console.print("Your numbers: ");
        console.printLn(enteredValues.toString());
        break;
      }
    }

  }

  private static int getGuessedNumber(Console console) {
    while (true) {
      String line = console.readLn("Guess a number: ");
      try {
        return TypeConverter.strToInt(line);
      } catch (Exception e) {
        console.printLn(String.format("Your input: '%s' is invalid. Please, try again.", line));
      }
    }
  }
}