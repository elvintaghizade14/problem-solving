package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ACMICPCTeam {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11100", "11010", "00101"})));
  }

  static class Pair<A, B> {
    final A a;
    final B b;

    public Pair(A a, B b) {
      this.a = a;
      this.b = b;
    }
  }

  private static int[] acmTeam(String[] topic) {
    int len = topic.length;
    List<Integer> data = IntStream.range(0, len)
            .boxed()
            .flatMap(a -> IntStream.range(a + 1, len)
                    .mapToObj(b -> new Pair<>(a, b)))
            .map(p -> findCommon(topic, p.a, p.b))
            .filter(n -> n > 0)
            .collect(Collectors.toList());
    int maxKnow = data.stream()
            .max(Comparator.comparingInt(a -> a))
            .orElseThrow(RuntimeException::new);
    int maxGroup = (int) data.stream()
            .filter(n -> n == maxKnow)
            .count();
    return new int[]{maxKnow, maxGroup};
  }

  private static int findCommon(String[] topic, int i1, int i2) {
    return (int) IntStream.range(0, topic[0].length())
            .mapToObj(idx -> topic[i1].charAt(idx) == '1' || topic[i2].charAt(idx) == '1')
            .filter(x -> x)
            .count();
  }
}