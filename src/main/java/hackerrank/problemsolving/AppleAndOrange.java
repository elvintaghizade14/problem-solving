package hackerrank.problemsolving;

import java.util.Arrays;

public class AppleAndOrange {

  public static void main(String[] args) {
    countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
  }

  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    System.out.println(countFruits(s, t, a, apples));
    System.out.println(countFruits(s, t, b, oranges));
  }

  private static int countFruits(int houseS, int houseE, int k, int[] fruits) {
    return (int) Arrays
            .stream(fruits)
            .filter(value -> (k + value) >= houseS && (k + value) <= houseE)
            .count();
  }
}