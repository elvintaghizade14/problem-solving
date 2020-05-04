package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class FindDigits {
  public static void main(String[] args) {
    System.out.println(findDigits(12));
    System.out.println(findDigits(1012));
  }

  private static int findDigits(int n) {
    List<Integer> digits = new ArrayList<>();
    int tmp = n;
    while (tmp > 0) {
      int r = tmp % 10;
      digits.add(r);
      tmp /= 10;
    }
    return (int) digits.stream()
            .filter(d -> d != 0)
            .filter(d -> n % d == 0)
            .count();
  }
}