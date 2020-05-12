package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BetweenTwoSets {
  public static void main(String[] args) {
    System.out.println(getTotalX(Arrays.asList(2, 3, 6), Arrays.asList(42, 84)));
    System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    System.out.println(getTotalX(Collections.singletonList(2), Arrays.asList(20, 30, 12)));
    System.out.println(getTotalX(Collections.singletonList(1), Collections.singletonList(100)));
    System.out.println(getTotalX(Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91),
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
  }

  private static int getTotalX(List<Integer> a, List<Integer> b) {
    int A = lcm(a);
    if (A < 0) return 0;
    int B = gcd(b);
    System.out.printf("lcm: %d, gcd:%d\n", A, B);
    int count = 0;
    for (int i = A; i <= B; i += A) {
      if (B % i == 0) count++;
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