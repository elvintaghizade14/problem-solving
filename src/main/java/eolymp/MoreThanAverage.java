package eolymp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18686/problems/199571
 */
public class MoreThanAverage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    double average = Arrays.stream(nums).average().orElse(nums[0]);
    int sum = 0;
    int count = 0;
    for (int num : nums) {
      if (num > average) {
        sum += num;
        count++;
      }
    }
    System.out.printf("%d %d", sum, count);
  }
}