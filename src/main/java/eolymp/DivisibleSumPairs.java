package eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18686/problems/199575
 */
public class DivisibleSumPairs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i; j < nums.length - 1; j++) {
        if ((nums[i] + nums[j + 1]) % k == 0) count++;
      }
    }
    System.out.println(count);
  }
}
