package hackerrank.day30Java;

public class Day29_bitwise_and {
  private static void findMax(int n, int k) {
    int max = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        int h = i & j;
        if (h < k && max < h) max = h;
      }
    }
    System.out.println(max);
  }
}
