package az.et.hackerrank.day30Java;

import java.util.Scanner;

public class Day7_arrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[n - 1 - i] = sc.nextInt();
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(nums[i]).append(' ');
    }
    System.out.println(result.toString().trim());
  }
}
