package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

  static class Pair {
    private final int a;
    private final int b;

    Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }

  static int divisibleSumPairs(int n, int k, int[] ar) {
    List<Pair> pairs = new ArrayList<>();
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar.length; j++) {
        if ((i != j) && ((ar[i] + ar[j]) % k == 0))
          pairs.add(new Pair(ar[i], ar[j]));
      }
    }
    return pairs.size() / 2;
  }

  public static void main(String[] args) {
    System.out.println(divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2}));
  }
}