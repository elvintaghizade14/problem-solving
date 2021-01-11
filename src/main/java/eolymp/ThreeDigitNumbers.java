package eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18542/problems/197890
 */
public class ThreeDigitNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    IntStream.range(100, 1000).map(i -> sc.nextInt()).forEach(num -> {
      int last = num % 10;
      int first = num / 100;
      int mid = (num / 10) % 10;
      if (num == (first + mid + last)) System.out.println(num);
    });
  }
}