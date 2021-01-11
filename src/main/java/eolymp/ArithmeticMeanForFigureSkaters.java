package eolymp;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18687/problems/199589
 */
public class ArithmeticMeanForFigureSkaters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      List<Integer> grades = IntStream.range(0, m).map(idx -> sc.nextInt()).boxed().collect(Collectors.toList());
      IntSummaryStatistics stats = grades.stream().mapToInt(Integer::intValue).summaryStatistics();
      int count = 0;
      double sum = 0;
      for (Integer grade : grades) {
        if (grade != stats.getMax() || grade != stats.getMin()) {
          sum += grade;
          count++;
        }
      }
      System.out.printf("%.2f", (sum / count));
    }
  }
}