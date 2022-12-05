package az.et.eolymp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/az/contests/18686/problems/199567
 */
public class LastTheBiggest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    int min = Arrays.stream(nums).max().orElse(nums[0]);
    int len = nums.length - 1;
    for (int i = len; i >= 0; i--) {
      if (min == nums[i]) {
        int temp = nums[i];
        nums[i] = nums[len];
        nums[len] = temp;
        break;
      }
    }
    Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
  }
}
