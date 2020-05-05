package hackerrank.problem_solving;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {

  private static int migratoryBirds(List<Integer> arr) {
    Map<Integer, Long> grouped = arr
            .stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    Long maxValue = grouped.values()
            .stream()
            .max(Comparator.comparingLong(i -> i))
            .orElseThrow(RuntimeException::new);

    Map.Entry<Integer, Long> result = grouped.entrySet()
            .stream()
            .filter(entry -> entry.getValue().equals(maxValue))
            .min(Comparator.comparingInt(Map.Entry::getKey))
            .orElseThrow(RuntimeException::new);

    return result.getKey();
  }
}
