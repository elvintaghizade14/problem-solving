package hackerrank.problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DynamicArray {
  public static void main(String[] args) {
    List<Integer> result = dynamicArray(2, Arrays.asList(
            Arrays.asList(1, 0, 5), Arrays.asList(1, 1, 7),
            Arrays.asList(1, 0, 3), Arrays.asList(2, 1, 0),
            Arrays.asList(2, 1, 1))
    );
    result.forEach(System.out::println);
  }

  public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
    List<List<Integer>> seqList = IntStream.range(0, n)
            .mapToObj(i -> new ArrayList<Integer>())
            .collect(Collectors.toList());
    List<Integer> result = new ArrayList<>();
    int lastAnswer = 0;
    for (List<Integer> q : queries) {
      int x = q.get(1);
      int y = q.get(2);

      if (q.get(0) == 1) seqList.get((x ^ lastAnswer) % n).add(y);
      else {
        List<Integer> seq = seqList.get((x ^ lastAnswer) % n);
        lastAnswer = seq.get(y % seq.size());
        result.add(lastAnswer);
      }
    }
    return result;
  }
}