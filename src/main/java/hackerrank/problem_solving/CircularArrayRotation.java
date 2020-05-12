package hackerrank.problem_solving;

import java.util.Arrays;

public class CircularArrayRotation {
  public static void main(String[] args) {
    circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1});
  }

  private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    int len = a.length;
    int[] rotated = new int[len];

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(rotated));
//    return new int[]{1, 1};
    throw new IllegalArgumentException("Not implemented...");
  }
}
