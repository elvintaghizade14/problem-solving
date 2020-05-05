package hackerrank.interview_prep;

import java.util.Arrays;

public class LeftRotationApp {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 4)));
    System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 3)));
    System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5}, 5)));
    System.out.println(Arrays.toString(rotLeft(new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, 10)));
  }

  static int[] rotLeft(int[] a, int d) {
    int len = a.length;
    d = d % len;
    int[] result = new int[len];
    for (int i = 0; i < len - d; i++) result[i] = a[d + i];
    for (int i = len - d; i < len; i++) result[i] = a[i - (len - d)];
    return result;
  }
}