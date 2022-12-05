package az.et.udemy;

import java.util.Scanner;

public class Factorial {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    int fact1 = factorial1(input);
    int fact2 = factorial2(input);

    // 3. output
    System.out.printf("Factorial of %d is %d - Head Recursion\n", input, fact1);
    System.out.printf("Factorial of %d is %d - Tail Recursion\n", input, fact2);
  }

  // Head recursion
  private static int factorial1(int value) {
    if (value == 1) return 1;
    return factorial1(value - 1) * value;
  }

  // Tail recursion
  private static int factorial2(int value) {
    return factorial2(value, 1);
  }

  private static int factorial2(int value, int acc) {
    if (value == 1) return acc;
    return factorial2(value-1, acc * value);
  }
}
