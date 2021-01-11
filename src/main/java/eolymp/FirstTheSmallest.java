package eolymp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18686/problems/199566
 */
public class FirstTheSmallest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    int min = Arrays.stream(nums).min().orElse(nums[0]);
    for (int i = 0; i < nums.length; i++) {
      if (min == nums[i]) {
        int temp = nums[i];
        nums[i] = nums[0];
        nums[0] = temp;
        break;
      }
    }
    Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
  }
}