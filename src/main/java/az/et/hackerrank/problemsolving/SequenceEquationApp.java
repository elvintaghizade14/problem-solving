package az.et.hackerrank.problemsolving;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceEquationApp {
  static int[] permutationEquation(int[] p) {
    final int len = p.length;
    Map<Integer, Integer> indexes = IntStream.range(0, len)
            .boxed()
            .collect(Collectors.toMap(idx -> p[idx], idx -> idx + 1, (a, b) -> b));
    int[] y = new int[len];
    IntStream.rangeClosed(1, len).forEach(i -> y[i - 1] = indexes.get(indexes.get(i)));
    return y;
  }

  public static void main(String[] args) {
    permutationEquation(new int[]{5, 2, 1, 3, 4});
  }
}
