package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MissingNumbers {
  static int[] missingNumbers(int[] arr, int[] brr) {
    Map<Integer, Long> a = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    Map<Integer, Long> b = Arrays.stream(brr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

    return b.keySet()
            .stream()
            .filter(k -> !a.containsKey(k) || b.get(k) > a.get(k))
            .mapToInt(Integer::intValue)
            .toArray();
  }

}
