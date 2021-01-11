package eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18686/problems/199573
 */
public class Invertor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.print(nums[i] + " ");
    }
  }
}