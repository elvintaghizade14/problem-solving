package hackerrank.day30Java;

import java.util.Scanner;

public class Day9_recursion {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    System.out.printf("Factorial with head recursion is: %d\n", factorialHR(n));
    System.out.printf("Factorial with tail recursion is: %d\n", factorialTR(n));
  }

  static int factorialHR(int n) {
    if (n == 1) return 1;
    return n * factorialHR(n - 1);
  }

  static int factorialTR(int n) {
    return factorialTR(n, 1);
  }

  static int factorialTR(int n, int f) {
    if (n == 1) return f;
    return factorialTR(n - 1, f * n);
  }
}
