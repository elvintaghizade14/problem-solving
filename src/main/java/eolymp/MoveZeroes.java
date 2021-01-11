package eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18687/problems/199591
 */
public class MoveZeroes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(index -> sc.nextInt()).toArray();
    int count = 0;
    for (int num : nums) {
      if (num != 0) System.out.print(num + " ");
      else count++;
    }
    for (int i = 0; i < count; i++) {
      System.out.print(0 + " ");
    }
  }
}