package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BirthdatCakeCandles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    long count = find_max_count(arr);

    System.out.println(count);
  }

  private static long find_max_count(int[] arr) {
    int max = Arrays
            .stream(arr)
            .max()
            .orElseThrow(NoSuchElementException::new);
    return Arrays
            .stream(arr)
            .filter(i -> i == max)
            .count();
  }
}