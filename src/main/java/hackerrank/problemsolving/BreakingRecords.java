package hackerrank.problemsolving;

import java.util.Arrays;

public class BreakingRecords {

  public static void main(String[] args) {
    int[] input = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
    System.out.println(Arrays.toString(breakingRecords(input)));
  }

  static int[] breakingRecords(int[] scores) {
    int min = scores[0];
    int max = scores[0];
    int[] ans = {0, 0};
    for (int i = 1; i < scores.length; i++) {
      if (min > scores[i]) {
        min = scores[i];
        ans[1]++;
      }
      if (max < scores[i]) {
        max = scores[i];
        ans[0]++;
      }
    }
    return ans;
  }

}
