package az.et.hackerrank.problemsolving;

public class MinimumDistance {
  public static void main(String[] args) {
    System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
  }

  private static int minimumDistances(int[] a) {
    int len = a.length;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < len - 1; i++) {
      for (int j = i + 1; j < len; j++) {
        if (a[i] == a[j]) {
          min = Math.min(min, j - i);
          break;
        }
      }
    }
    return min != Integer.MAX_VALUE ? min : -1;
  }
}