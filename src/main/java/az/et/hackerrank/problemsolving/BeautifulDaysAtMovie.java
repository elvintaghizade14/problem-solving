package az.et.hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BeautifulDaysAtMovie {
  public static void main(String[] args) {
    System.out.println(beautifulDays(20, 23, 6));
  }

  private static int beautifulDays(int i, int j, int k) {
    return (int) IntStream.rangeClosed(i, j)
            .map(d -> d - reverse(d))
            .filter(s -> s % k == 0)
            .count();
  }

  private static int reverse(int day) {
    List<Integer> digits = new ArrayList<>();
    while (day > 0) {
      digits.add(day % 10);
      day /= 10;
    }
    int len = digits.size();
    return IntStream.range(0, len)
            .map(i -> (int) (digits.get(i) * Math.pow(10, len - 1 - i)))
            .sum();
  }
}