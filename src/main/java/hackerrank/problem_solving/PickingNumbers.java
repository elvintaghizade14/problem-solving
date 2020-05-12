package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PickingNumbers {
  public static void main(String[] args) {
    System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
  }

  static class Pair {
    final int a;
    final int b;

    Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  public static int pickingNumbers(List<Integer> a) {
    int len = a.size();
    throw new IllegalArgumentException("should be implement...");
  }
}