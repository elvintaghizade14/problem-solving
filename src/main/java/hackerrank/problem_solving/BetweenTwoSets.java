package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BetweenTwoSets {
  public static void main(String[] args) {
    System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    System.out.println(getTotalX(Collections.singletonList(2), Arrays.asList(20, 30, 12)));
    System.out.println(getTotalX(Collections.singletonList(1), Collections.singletonList(100)));
    throw new IllegalArgumentException("not implemented yet...");
  }

  private static int getTotalX(List<Integer> a, List<Integer> b) {
    int A = lcm(a);
    int B = gcd(b);
    System.out.printf("lcm: %d, gcd:%d\n", A, B);
    int count = 0;
    for (int i = A; i <= B; i *= 2) {
      if (B % A == 0){
        count++;
        System.out.println(i);
      }
    }
    return count;
  }

  private static int gcd(List<Integer> in) {
    int res = in.get(0);
    for (int i = 1; i < in.size(); i++) res = gcd(res, in.get(i));
    return res;
  }

  private static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  private static int lcm(List<Integer> in) {
    int res = in.get(0);
    for (int i = 1; i < in.size(); i++) res = lcm(res, in.get(i));
    return res;
  }

  private static int lcm(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    return IntStream.rangeClosed(1, min)
            .filter(f -> (f * max) % min == 0)
            .map(f -> Math.abs(f * max))
            .findFirst()
            .orElse(min * max);
  }
}