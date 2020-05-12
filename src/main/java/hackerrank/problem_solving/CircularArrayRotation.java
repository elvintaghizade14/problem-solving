package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CircularArrayRotation {
  public static void main(String[] args) {
    circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1});
    circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1, 2});
    circularArrayRotation(new int[]{3, 4, 5}, 0, new int[]{0, 1, 2});
    circularArrayRotation(new int[]{3, 4, 5}, 1, new int[]{0, 1, 2});
    circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{0, 1, 2});
    circularArrayRotation(new int[]{3, 4, 5}, 3, new int[]{0, 1, 2});
  }

  private static int[] circularArrayRotation1(int[] a, int k, int[] queries) {
    int len = a.length;
    int res_len = queries.length;
    int[] res = new int[res_len];
    k %= len;
    for (int i = 0; i < res_len; i++) {
      res[i] = a[(len - k + queries[i]) % len];
    }
    System.out.println(Arrays.toString(res));
    return res;
  }

  private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    final int len = a.length;
    final int k1 = len - k % len;
    return Arrays.stream(queries)
            .map(i -> a[(k1 + i) % len])
            .toArray();
  }
}