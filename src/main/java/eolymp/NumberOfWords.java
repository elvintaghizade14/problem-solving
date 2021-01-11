package eolymp;

import java.util.Scanner;

/**
 * url: https://www.e-olymp.com/en/contests/18847/problems/201573
 */
public class NumberOfWords {
  public static void main(String[] args) {
    String line = new Scanner(System.in).nextLine();
    System.out.println(line.split(" ").length);
  }
}
