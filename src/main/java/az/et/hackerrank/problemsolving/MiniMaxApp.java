package az.et.hackerrank.problemsolving;

import java.util.Scanner;

public class MiniMaxApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = new int[5];
    String[] arrItems = sc.nextLine().split(" ");

    for (int i = 0; i < 5; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    miniMaxSum(arr);
  }

  private static void miniMaxSum(int[] in) {
    long min = in[0];
    long max = in[1];
    long sum = 0;

    for (int val : in) {
      if (min > val) min = val;
      if (max < val) max = val;
      sum += val;
    }

    System.out.printf("%d %d\n", (sum - max), (sum - min));
  }
}
