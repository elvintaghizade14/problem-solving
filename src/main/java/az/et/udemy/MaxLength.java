package az.et.udemy;

import java.util.Scanner;

public class MaxLength {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String a = sc.next();
    String b = sc.next();

    // 2. process
    String res = maxLength(a, b);

    // 3. output
    System.out.println(res);
  }

  private static String maxLength(String a, String b) {
    return a.length() > b.length() ? a : b;
  }
}
