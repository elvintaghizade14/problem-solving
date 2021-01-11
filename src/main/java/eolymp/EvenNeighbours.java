package eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18687/problems/199580
 */
public class EvenNeighbours {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    long count = IntStream.range(1, nums.length - 1)
            .filter(i -> areEvenNeighbours(nums, i))
            .count();
    System.out.println(count);
  }

  private static boolean areEvenNeighbours(int[] nums, int idx) {
    return (nums[idx - 1] % 2 == 0) && (nums[idx + 1] % 2 == 0);
  }
}