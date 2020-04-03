package hackerrank.day30;

import java.util.Scanner;
//import java.util.StringJoiner;

public class Day6_lets_review {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
//    StringJoiner result = new StringJoiner("\n");
    StringBuilder result = new StringBuilder();
    while (count-- > 0) {
      StringBuilder even = new StringBuilder();
      StringBuilder odd = new StringBuilder();
      String s = sc.next();
      for (int i = 0; i < s.length(); i++) {
        if (i%2 == 0) even.append(s.charAt(i));
        else odd.append(s.charAt(i));
      }
      result.append(String.format("%s %s\n", even, odd));
    }
    System.out.println(result.toString().trim());
  }
}