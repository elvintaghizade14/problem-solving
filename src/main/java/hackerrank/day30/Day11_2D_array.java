package hackerrank.day30;

import java.util.Scanner;

public class Day11_2D_array {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0},
    };
    int[][] arr2 = {
            {-1, -1, 0, -9, -2, -2},
            {-2, -1, -6, -8, -2, -5},
            {-1, -1, -1, -2, -3, -4},
            {-1, -9, -2, -4, -4, -5},
            {-7, -3, -3, -2, -9, -9},
            {-1, -3, -1, -2, -4, -5}
    };


    System.out.println(maxHour(arr));
    System.out.println(maxHour(arr2));
  }

  private static int maxHour(int[][] arr) {
    int max = 0;
    for (int row = 1; row < 5; row++) {
      for (int col = 1; col < 5; col++) {
        int sum = arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1] +
                arr[row][col] +
                arr[row + 1][col - 1] + arr[row + 1][col] + arr[row + 1][col + 1];
        max = Math.max(max, sum);
      }
    }
//    return max;
    throw new IllegalArgumentException("Not implemented correctly. Need for rewriting..");
  }
}
