package az.et.hackerrank.day30Java;

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
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr[0].length - 2; j++) {
        int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +
                arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
//        sum = sum < 0 ? -sum : sum;
        max = Math.max(max, sum);
      }
    }
    return max;
  }
}
