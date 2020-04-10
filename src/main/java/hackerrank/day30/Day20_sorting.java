package hackerrank.day30;

import java.util.Scanner;

public class Day20_sorting {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];

    for (int a_i = 0; a_i < n; a_i++) a[a_i] = in.nextInt();

    System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d\n",
            bubbleSort(a), a[0], a[a.length - 1]);
  }

  private static int bubbleSort(int[] a) {
    int n = a.length;
    int numberOfSwaps = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
          int tmp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = tmp;
          numberOfSwaps++;
        }
      }
      if (numberOfSwaps == 0) return numberOfSwaps;
    }
    return numberOfSwaps;
  }
}
