package az.et.udemy;

import java.util.Scanner;

public class ContainsApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();

    // 2. process
    boolean res = isContain(a, b, c);

    // 3. output
    System.out.println(res);
  }

  private static boolean isContain(String a, String b, String c) {
    return (a.contains(c) && b.contains(c));
  }
}
