package udemy;

import java.util.Scanner;

public class CountOfDigits {
  private final static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    int count = countOfDigits(input);

    // 3. output
    System.out.printf("Number of digits: %d\n", count);
  }

  private static int countOfDigits(int value) {
    int count = 0;
    while (value > 0) {
      count++;
      value /= 10;
    }
    return count;
  }
}
