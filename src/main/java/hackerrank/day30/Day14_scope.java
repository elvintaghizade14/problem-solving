package hackerrank.day30;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day14_scope {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Difference difference = new Difference(a);

    difference.computeDifference();

    System.out.print(difference.maximumDifference);
  }
}

class Difference {
  private int[] elements;
  public int maximumDifference;

  public Difference(int[] elements) {
    this.elements = elements;
  }

  void computeDifference() {
    int min = Arrays.stream(elements).min().orElseThrow(java.util.NoSuchElementException::new);
    int max = Arrays.stream(elements).max().orElseThrow(java.util.NoSuchElementException::new);
    maximumDifference = max - min;
  }

  public static int maxDifference(int[] arr) {
    return Arrays.stream(arr).min().orElseThrow(NoSuchElementException::new) -
            Arrays.stream(arr).max().orElseThrow(NoSuchElementException::new);
  }
}