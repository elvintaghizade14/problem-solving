package hackerrank.day30Java;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day26_nested_logic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int actDay = sc.nextInt();
    int actMonth = sc.nextInt();
    int actYear = sc.nextInt();
    int dueDay = sc.nextInt();
    int dueMonth = sc.nextInt();
    int dueYear = sc.nextInt();

    LocalDate actDate = LocalDate.of(actYear, actMonth, actDay);
    LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);

    System.out.println(calcFine(actDate, dueDate));
  }

  private static int calcFine(LocalDate actDate, LocalDate dueDate) {
    if (actDate.isBefore(dueDate) || actDate.equals(dueDate)) return 0;
    else if (actDate.getMonth().getValue() == dueDate.getMonth().getValue() &&
            actDate.getYear() == dueDate.getYear()) return (int) (ChronoUnit.DAYS.between(dueDate, actDate) * 15);
    else if (actDate.getYear() == dueDate.getYear()) return (int) (ChronoUnit.MONTHS.between(dueDate, actDate) * 500);
    else return 10000;
  }
}