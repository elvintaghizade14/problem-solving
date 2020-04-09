package hackerrank.java;

import java.util.Scanner;

public class StringReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String line = sc.nextLine();
    System.out.println(isPalindrome(line));
  }

  private static String isPalindrome(String line) {
    char[] chars = line.toCharArray();
    int l = chars.length - 1;
    for (int i = 0; i < l; i++) {
      if (chars[i] != chars[l - i]) {
        return "No";
      }
    }
    return "Yes";
  }
}
