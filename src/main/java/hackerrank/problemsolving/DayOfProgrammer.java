package hackerrank.problemsolving;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfProgrammer {
  public static void main(String[] args) {
    System.out.println(dayOfProgrammer(2016));
    System.out.println(dayOfProgrammer(2017));
    System.out.println(dayOfProgrammer(1800));
    System.out.println(dayOfProgrammer(1918));
    System.out.println(dayOfProgrammer(1984));
  }

  private static String dayOfProgrammer(int year) {
    final String format = "dd.MM.yyyy";
    if (year == 1918) return "26.09.1918";
    else if (year < 1918) {
      return year % 4 == 0
              ? constDate(12, 9, year)
              : constDate(13, 9, year);
    } else {
      return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
              ? constDate(12, 9, year)
              : constDate(13, 9, year);
    }
  }

  private static String constDate(int day, int month, int year) {
    final String format = "dd.MM.yyyy";
    return LocalDate.of(year, month, day).format(DateTimeFormatter.ofPattern(format));
  }
}