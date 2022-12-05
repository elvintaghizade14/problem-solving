package az.et.hackerrank.interview_prep;

public class BubbleSort {
  public static void main(String[] args) {
    countSwaps(new int[]{3, 2, 1});
  }

  static void countSwaps(int[] a) {
    int len = a.length;
    int numSwaps = 0;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len - 1; j++) {
        if (a[j] > a[j + 1]) {
          numSwaps++;
          swap(a, j, j + 1);
        }
      }
    }
    System.out.printf("Array is sorted in %d swaps.\n", numSwaps);
    System.out.printf("First Element: %d\n", a[0]);
    System.out.printf("Last Element: %d\n", a[len - 1]);
  }

  private static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
