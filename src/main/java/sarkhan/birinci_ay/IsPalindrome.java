package sarkhan.birinci_ay;

import java.util.Scanner;

public class IsPalindrome {
  private final static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String input = sc.nextLine();

    // 2. process
    boolean isPalindrome1 = isPalindrome1(input);
    boolean isPalindrome2 = isPalindrome2(input);
    String result1 = isPalindrome1 ? "Input is palindrome" : "Input is not palindrome";
    String result2 = isPalindrome2 ? "Input is palindrome" : "Input is not palindrome";

    // 3. output
    System.out.println(result1);
    System.out.println(result2);
  }

  private static boolean isPalindrome1(String input) {
    String value = input.toLowerCase();
    final int len = value.length();
    for (int i = 0; i < value.length(); i++) {
      if (value.charAt(i) != value.charAt(len - 1 - i)) return false;
    }
    return true;
  }

  private static boolean isPalindrome2(String input) {
    return input.toLowerCase().contentEquals(new StringBuilder(input).reverse().toString().toLowerCase());
  }
}
