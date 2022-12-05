package az.et.udemy;

import java.util.Scanner;

public class FourNums {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    // 2. process
    boolean ans = check(a, b, c, d);

    // 3. output
    System.out.println(ans ? "YES" : "NO");
  }

  private static boolean check(int a, int b, int c, int d) {
    return (a == b) || (a == c) || (a == d) || (b == c) || (b == d);
  }
}
