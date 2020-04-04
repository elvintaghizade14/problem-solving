package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    plusMinus(arr);
    sc.close();
  }

  private static void plusMinus(int[] arr) {
    int len = arr.length;
    double p = (double) Arrays.stream(arr).filter(i -> i > 0).count() / len;
    double n = (double) Arrays.stream(arr).filter(i -> i < 0).count() / len;
    double o = (double) Arrays.stream(arr).filter(i -> i == 0).count() / len;

    System.out.printf("%.6f\n", p);
    System.out.printf("%.6f\n", n);
    System.out.printf("%.6f\n", o);
  }
}
