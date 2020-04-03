package sarkhan.birinci_ay;

import java.util.Scanner;

public class SumOfDigits {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    int result = sumOfDigits(input);

    // 3. output (print)
    System.out.println(result);
  }

  private static int sumOfDigits(int value) {
    int sum = 0;
    while (value > 0) {
      sum += value % 10;
      value /= 10;
    }
    return sum;
  }
}
