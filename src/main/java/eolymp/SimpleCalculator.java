package eolymp;

import java.util.Scanner;

/**
 * url: https://www.e-olymp.com/az/contests/18847/problems/201572
 */
public class SimpleCalculator {
  public static void main(String[] args) {
    // 1. input
    String[] line = new Scanner(System.in).nextLine().split(" ");

    // 2. process
    int num1 = Integer.parseInt(line[0]);
    int num2 = Integer.parseInt(line[2]);
    int result;
    switch (line[1]) {
      case "+": result = num1 + num2; break;
      case "-": result = num1 - num2; break;
      case "*": result = num1 * num2; break;
      default:  result = num1 / num2; break;
    }

    // 3. output
    System.out.println(result);
  }
}
