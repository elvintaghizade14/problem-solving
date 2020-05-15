package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PickingNumbers {
  public static void main(String[] args) {
    System.out.println(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
    System.out.println(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
  }

  private static int pickingNumbers(List<Integer> a) {
    return a.stream()
            .map(v -> max_count(v, a))
            .max(Comparator.comparingInt(v -> v))
            .orElseThrow(RuntimeException::new);
  }

  private static int max_count(int v, List<Integer> a) {
    long low = a.stream().filter(i -> (i == v) || (v - i == 1)).count();
    long high = a.stream().filter(i -> (i == v) || (i - v == 1)).count();
    return (int) Math.max(low, high);
  }
}