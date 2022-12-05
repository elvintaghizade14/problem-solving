package az.et.udemy;

import java.util.Scanner;

public class IsPalindromeNumber {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    boolean flag = isPalindromeNum1(input);
    String result = flag ? "Is palindrome number" : "Is not palindrome number";

    // 3. output
    System.out.println(result);
  }

  private static boolean isPalindromeNum1(int value) {
    String num = String.valueOf(value);
    return num.contentEquals(new StringBuilder(num).reverse());
  }
}
