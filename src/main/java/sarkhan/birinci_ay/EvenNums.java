package sarkhan.birinci_ay;

import java.util.Scanner;
import java.util.StringJoiner;

public class EvenNums {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    String result = findEvens(input);

    // 3. output (print)
    System.out.println(result);
  }

  /**
   * @param value => integer
   * @return => all even nums from 0 to the given value
   */
  private static String findEvens(int value) {
    StringJoiner sj = new StringJoiner(", ", "[", "]");
    for (int i = 0; i <= value; i++) {
      if (i % 2 == 0) sj.add(String.valueOf(i));
    }
    return sj.toString();
  }
}
