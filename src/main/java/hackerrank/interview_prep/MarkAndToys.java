package hackerrank.interview_prep;

import java.util.Arrays;

public class MarkAndToys {
  public static void main(String[] args) {
    System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
  }

  static int maximumToys(int[] prices, int k) {
    int amount = 0;
    int count = 0;
    int[] sorted = Arrays.stream(prices)
            .sorted()
            .toArray();
    for (int value : sorted) {
      if (amount + value <= k) {
        amount += value;
        count++;
      } else return count;
    }
    return count;
  }
}
