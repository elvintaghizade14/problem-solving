package hackerrank.java;

public class Java2DArray {
  public static void main(String[] args) {
    int[][] input = new int[6][6];
    int[][] data = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
    };
    System.out.println(getMaxHourglass(data));
  }

  private static int getMaxHourglass(int[][] data) {
    int max = Integer.MIN_VALUE;
    for (int i = 1; i < 5; i++) {
      for (int j = 1; j < 5; j++) {
        int sum = data[i - 1][j - 1] + data[i - 1][j] + data[i - 1][j + 1] +
                data[i][j] +
                data[i + 1][j - 1] + data[i + 1][j] + data[i + 1][j + 1];
        max = Math.max(max, sum);
//        System.out.printf("sum: %d, max: %d\n", sum, max);
      }
    }
    return max;
  }

}