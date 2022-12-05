package az.et.udemy;

import java.util.Scanner;

public class ConcatApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String s = sc.next();
    String c = sc.next();
    int n = sc.nextInt();

    // 2. process
    String res = concate(s, c, n);

    // 3. output
    System.out.println(res);
  }

  private static String concate(String s, String c, int n) {
    StringBuilder res = new StringBuilder();
    res.append(s);
    for (int i = 0; i < n; i++) {
      res.append(c);
    }
    return res.toString();
  }
}
