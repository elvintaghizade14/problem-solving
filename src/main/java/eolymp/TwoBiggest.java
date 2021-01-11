package eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoBiggest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    int max = nums[0];
    int maxIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIndex = i;
      }
    }
    int finalMaxIndex = maxIndex;
    int max2 = IntStream.range(0, nums.length).filter(i -> i != finalMaxIndex).max().orElse(max);
    System.out.println(max + max2);
  }
}