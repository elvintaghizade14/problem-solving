package az.et.hackerrank.java;

import java.time.LocalDate;
import java.util.Scanner;

public class JDateTime {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int m = sc.nextInt();
    int d = sc.nextInt();
    int y = sc.nextInt();

    // 2. process
    String res = findDay(m, d, y);

    // 3. output
    System.out.println(res);
  }

  static String findDay(int m, int d, int y) {
    LocalDate ld = LocalDate.of(y, m, d);
    return ld.getDayOfWeek().toString();
  }
}
