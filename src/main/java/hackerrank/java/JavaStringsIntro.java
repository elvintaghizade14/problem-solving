package hackerrank.java;

import java.util.Scanner;

public class JavaStringsIntro {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String a = sc.next();
    String b = sc.next();

    // 1
    System.out.println(a.length() + b.length());
    // 2
    System.out.println(isAfter(a, b) ? "Yes" : "No");
    // 3
    System.out.printf("%s %s", capitalize(a), capitalize(b));
  }

  private static boolean isAfter(String s1, String s2) {
    int len = Math.min(s1.length(), s2.length());
    boolean isAfter = true;
    for (int i = 0; i < len; i++) {
      if (s1.charAt(i) > s2.charAt(i)) return true;
      else if (s1.charAt(i) < s2.charAt(i)) return false;
    }
    return false;
  }

  private static String capitalize(String s) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i == 0) res.append((char) (s.charAt(i) - 32));
      else res.append(s.charAt(i));
    }
    return res.toString();
  }
}