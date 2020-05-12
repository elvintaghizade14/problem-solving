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

  static class Pair {
    final int a;
    final int b;

    Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  public static int pickingNumbers(List<Integer> a) {
    int max = a.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator.comparingLong(Map.Entry::getValue))
            .orElseThrow(RuntimeException::new)
            .getKey();

    long low = a.stream().mapToInt(v -> v).filter(v -> (max == v) || (max - v == 1)).count();
    long high = a.stream().mapToInt(v -> v).filter(v -> (max == v) || (v - max == 1)).count();

//    return (int) Math.max(low, high);
    throw new IllegalArgumentException("Need to implement..");
  }
}