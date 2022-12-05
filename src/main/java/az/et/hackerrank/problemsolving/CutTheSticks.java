package az.et.hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CutTheSticks {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8})));
    System.out.println(Arrays.toString(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1})));
  }

  private static int[] cutTheSticks(int[] arr) {
    int[] copy = arr.clone();
    int len = copy.length;
    long count = len;
    ArrayList<Long> res = new ArrayList<>();
    while (count > 0) {
      res.add(count);
      long min = Arrays.stream(copy).filter(v -> v > 0).min().orElseThrow(RuntimeException::new);
      IntStream.range(0, len).forEach(i -> copy[i] -= min);
      count = Arrays.stream(copy).filter(v -> v > 0).count();
    }
    int[] result = new int[res.size()];
    IntStream.range(0, result.length).forEach(idx -> result[idx] = Math.toIntExact(res.get(idx)));
    return result;
  }
}
