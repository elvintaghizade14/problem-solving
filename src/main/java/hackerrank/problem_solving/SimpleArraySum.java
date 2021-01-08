package hackerrank.problem_solving;

import java.util.Arrays;

public class SimpleArraySum {
  static int simpleArraySum(int[] ar) {
    return Arrays.stream(ar).sum();
  }
}
