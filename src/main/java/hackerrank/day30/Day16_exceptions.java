package hackerrank.day30;

import java.util.Scanner;

public class Day16_exceptions {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    try {
      System.out.println(Integer.parseInt(S));
    } catch (NumberFormatException nfe) {
      System.out.println("Bad String");
    }
  }
}