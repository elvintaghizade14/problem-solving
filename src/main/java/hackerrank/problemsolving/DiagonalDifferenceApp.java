package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifferenceApp {
  public static void main(String[] args) {
    // 1. input
    List<List<Integer>> data = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(9, 8, 7)
    );

    // 2. process
    int result1 = diagonalDifference1(data);
    int result2 = diagonalDifference2(data);
    int result3 = diagonalDifference3(data);
    int result4 = diagonalDifference4(data);

    // 3. output
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
  }

  private static int diagonalDifference1(List<List<Integer>> data) {
    int r = data.size();
    int c = data.get(0).size();
    int sum_d1 = 0;
    int sum_d2 = 0;
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        if (i == j) sum_d1 += data.get(i).get(j);
        if ((i + j) == (r - 1)) sum_d2 += data.get(i).get(j);
      }
    }
    return Math.abs(sum_d1 - sum_d2);
  }

  private static int diagonalDifference2(List<List<Integer>> data) {
    int sum_d1 = 0;
    int sum_d2 = 0;
    int l = data.size();
    for (int i = 0; i < l; i++) {
      sum_d1 += data.get(i).get(i);
      sum_d2 += data.get(i).get(l - 1 - i);
    }
    return Math.abs(sum_d1 - sum_d2);
  }

  private static int diagonalDifference3(List<List<Integer>> data) {
    int len = data.size();
    int sum_d1 = IntStream.range(0, len)
            .map(i -> data.get(i).get(i))
            .sum();
    int sum_d2 = IntStream.range(0, len)
            .map(i -> data.get(i).get(len - 1 - i))
            .sum();
    return Math.abs(sum_d1 - sum_d2);
  }

  private static int diagonalDifference4(List<List<Integer>> data) {
    int len = data.size();
    return Math.abs(IntStream.range(0, len)
            .map(i -> data.get(i).get(i) - data.get(i).get(len - 1 - i))
            .sum());
  }
}
