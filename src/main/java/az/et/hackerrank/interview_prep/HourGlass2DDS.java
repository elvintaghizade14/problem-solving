package az.et.hackerrank.interview_prep;

public class HourGlass2DDS {
  private static int hourglassSum(int[][] arr) {
    int len = arr.length - 1;
    int max = Integer.MIN_VALUE;
    for (int row = 1; row < len; row++) {
      for (int col = 1; col < len; col++) {
        int sum = arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1]
                + arr[row][col]
                + arr[row + 1][col - 1] + arr[row + 1][col] + arr[row + 1][col + 1];
        max = Math.max(max, sum);
      }
    }
    return max;
  }
}
