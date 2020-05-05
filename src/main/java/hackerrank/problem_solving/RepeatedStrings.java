package hackerrank.problem_solving;

import java.util.stream.IntStream;

public class RepeatedStrings {
  public static void main(String[] args) {
    System.out.println(repeatedString("aba", 10L));
    System.out.println(repeatedString("a", 1000000000000L));
  }

  private static long repeatedString(String s, long n) {
    int len = s.length();
    long len_count = s.chars().filter(c -> c == 'a').count();
    long r_count = IntStream.range(0, (int) (n % len))
            .map(s::charAt)
            .filter(c -> c == 'a')
            .count();
    return len_count * (n / len) + r_count;
  }
}