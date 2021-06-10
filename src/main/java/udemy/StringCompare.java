package udemy;

import java.util.Scanner;

public class StringCompare {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String s1 = sc.next();
    String s2 = sc.next();
    // 2. process
    boolean res = isSame(s1, s2);

    // 3. output
    System.out.println(res);
  }

  private static boolean isSame(String s1, String s2) {
    return s1.equals(s2);
  }
}
