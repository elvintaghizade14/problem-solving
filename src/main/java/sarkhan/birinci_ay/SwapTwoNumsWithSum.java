package sarkhan.birinci_ay;

import java.util.Scanner;

public class SwapTwoNumsWithSum {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.printf("First num: %d, second num: %d\n", num1, num2);

    // 2. process
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    // 3. output
    System.out.printf("First num: %d, second num: %d\n", num1, num2);
  }
}
