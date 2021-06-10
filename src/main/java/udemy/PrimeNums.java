package udemy;

import java.util.Scanner;
import java.util.StringJoiner;

public class PrimeNums {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    String result = findPrimes(input);

    // 3. output (print)
    System.out.println(result);
  }

  private static String findPrimes(int value) {
    if (value <= 0) return "Wrong value entered!";
    if (value == 1) return "1 is neither prime nor compound number";
    if (value == 2) return "[2]";
    else {
      StringJoiner sj = new StringJoiner(", ", "[", "]");
      sj.add("2");
      for (int i = 3; i <= value; i++) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            flag = false;
            break;
          }
        }
        if (flag) sj.add(String.valueOf(i));
      }
      return sj.toString();
    }
  }
}
