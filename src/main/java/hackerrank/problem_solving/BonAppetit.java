package hackerrank.problem_solving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BonAppetit {
  public static void main(String[] args) {
    bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
    bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);
  }

  private static void bonAppetit(List<Integer> bill, int k, int b) {
    int sum = IntStream.range(0, bill.size())
            .filter(idx -> idx != k)
            .map(bill::get)
            .sum() / 2;

    System.out.println(sum == b ? "Bon Appetit" : b - sum);
  }
}