package hackerrank.day10Statistics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Day0MeanMedianMode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    System.out.println(getMean(nums));
    System.out.println(getMedian(nums));
    System.out.println(getMode(nums));
  }

  private static double getMean(int[] nums) {
    return (double) Arrays.stream(nums).sum() / nums.length;
  }

  private static double getMedian(int[] nums) {
    int size = nums.length;
    int[] copy = nums.clone();
    Arrays.sort(copy);
    double median;
    if (size % 2 == 0) median = (double) (copy[size / 2 - 1] + copy[size / 2]) / 2;
    else median = copy[(size - 1) / 2];
    return median;
  }

  private static int getMode(int[] a) {
    int mode = 0;
    int size = a.length;
    int[] copy = a.clone();
    Arrays.sort(copy);
    int count = 0, max = 0;
    int current = copy[0];
    for (int i = 0; i < size; i++) {
      if (copy[i] == current) count++;
      else {
        count = 1;
        current = copy[i];
      }
      if (count > max) {
        max = count;
        mode = copy[i];
      }
    }
    return mode;
  }

}