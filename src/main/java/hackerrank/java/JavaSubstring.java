package hackerrank.java;

import java.util.Scanner;

public class JavaSubstring {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String s = sc.next();
    int start = sc.nextInt();
    int end = sc.nextInt();
    System.out.println(s.substring(start, end));
  }
}
