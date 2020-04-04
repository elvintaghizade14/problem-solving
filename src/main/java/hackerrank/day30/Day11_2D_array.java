package hackerrank.day30;

import java.util.Scanner;

public class Day11_2D_array {
  private static final Scanner sc = new Scanner(System.in);

  private static int maxHour(int[][] arr) {
    return 0;
  }

  public static void main(String[] args) {
    int[][] arr = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0},
    };
    System.out.println(maxHour(arr));
  }
}
