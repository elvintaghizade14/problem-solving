package az.et.hackerrank.problemsolving;

import java.util.Arrays;

public class ClimbingTheLeaderboard {
  public static void main(String[] args) {

  }

  /**
   * @param scores array of integers: scores of game
   * @param alice  array of integers: scores of alice
   * @return array of integers: ranks of alice
   * <p>
   * complexity is (roughly) O(n^2)
   */
  private static int[] climbingLeaderboard(int[] scores, int[] alice) {
    return Arrays.stream(alice).map(a -> {
      int[] biggers = Arrays.stream(scores).filter(sc -> sc >= a).distinct().toArray();
      if (biggers.length == 0) return 1;
      if (biggers[biggers.length - 1] == a) return biggers.length;
      return biggers.length + 1;
    }).toArray();
  }

  /**
   * @param scores array of integers: scores of game
   * @param alice  array of integers: scores of alice
   * @return array of integers: ranks of alice
   * <p>
   * complexity is (roughly) O(n + logn)
   */
  private static int[] climbingLeaderboard2(int[] scores, int[] alice) {
    Integer[] distinct = Arrays.stream(scores).distinct().boxed().toArray(Integer[]::new);
    return Arrays.stream(alice).map(a -> calc_rank(distinct, a)).toArray();
  }

  private static int calc_rank(Integer[] distinct, int a) {
    int idx = Arrays.binarySearch(distinct, a, (i1, i2) -> i2 - i1);
    return idx < 0 ? Math.abs(idx) : idx + 1;
  }
}
