package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
  public static void main(String[] args) {
//    throw new IllegalArgumentException("not implemented yet...");
    System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    System.out.println(getTotalX(Collections.singletonList(2), Arrays.asList(20, 30, 12)));
  }

  private static int getTotalX(List<Integer> a, List<Integer> b) {
    int A = lcm(a);
    int B = gcd(b);
    System.out.printf("lcm: %d, gcd:%d\n", A, B);
    int count = 0;
    for (int i = A; i <= B; i *= 2) {
      if (B % A == 0) count++;
    }
    return count;
  }

  private static int gcd(List<Integer> in) {
    int res = in.get(0);
    for (int i = 1; i < in.size(); i++) res = gcd(res, in.get(i));
    return res;
  }

  private static int gcd(int a, int b) {
    throw new IllegalArgumentException("should be implemented...");
  }

  private static int lcm(List<Integer> in) {
    int res = in.get(0);
    for (int i = 1; i < in.size(); i++) res = lcm(res, in.get(i));
    return res;
  }

  private static int lcm(int a, int b) {
    throw new IllegalArgumentException("should be implemented...");
  }
}