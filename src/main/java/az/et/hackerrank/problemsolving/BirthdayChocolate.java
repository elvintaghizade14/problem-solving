package az.et.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BirthdayChocolate {
  public static void main(String[] args) {
    System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));
    System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));
    System.out.println(birthday(Collections.singletonList(4), 4, 1));
  }

  static int birthday(List<Integer> s, int d, int m) {
    int count = 0;
    for (int i = 0; i <= s.size() - m; i++) {
      if (IntStream.range(i, i + m).map(s::get).sum() == d) count++;
    }
    return count;
  }

}
