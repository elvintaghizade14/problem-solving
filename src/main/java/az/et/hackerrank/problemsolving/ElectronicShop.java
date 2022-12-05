package az.et.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ElectronicShop {

  public static void main(String[] args) {
    System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
  }

  static class Pair {
    final int k;
    final int d;

    Pair(int k, int d) {
      this.k = k;
      this.d = d;
    }
  }

  private static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    return IntStream.range(0, keyboards.length).boxed().flatMap(k_i ->
            Arrays.stream(drives).mapToObj(drive -> new Pair(keyboards[k_i], drive)))
            .map(p -> findSum(p))
            .filter(s -> s <= b)
            .max(Comparator.comparingInt(i -> i))
            .orElse(-1);
  }

  private static int findSum(Pair p) {
    return p.k + p.d;
  }
}
