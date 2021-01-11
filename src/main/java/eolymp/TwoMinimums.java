package eolymp;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoMinimums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt())
            .boxed().collect(Collectors.toList());
    IntSummaryStatistics statistics = nums.stream().mapToInt(Integer::intValue).summaryStatistics();
    int min1 = statistics.getMin();
    int min2 = nums.stream().mapToInt(Integer::intValue).filter(n -> n != min1).min().orElse(min1);
    System.out.println(min1 + " " + min2);
  }
}