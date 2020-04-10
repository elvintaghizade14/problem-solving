package hackerrank.day30;

import java.util.Scanner;

public class Day17_more_excps {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t-- > 0) {

      int n = in.nextInt();
      int p = in.nextInt();
      Calculator myCalculator = new Calculator();
      try {
        int ans = myCalculator.power(n, p);
        System.out.println(ans);
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    in.close();
  }
}

class Calculator {
  int power(int n, int p) throws IllegalArgumentException {
    if (n >= 0 && p >= 0) return (int) Math.pow(n, p);
    else {
      throw new IllegalArgumentException("n and p should be non-negative");
    }
  }
}