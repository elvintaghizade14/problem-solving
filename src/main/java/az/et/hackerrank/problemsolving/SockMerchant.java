package az.et.hackerrank.problemsolving;

import java.util.Map;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SockMerchant {
  public static void main(String[] args) {
    System.out.println(sockMerchant1(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    System.out.println(sockMerchant2(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
  }

  private static int sockMerchant1(int n, int[] ar) {
    Map<Integer, Long> grouped = Arrays.stream(ar)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    return grouped.values()
            .stream()
            .map(Long::intValue)
            .mapToInt(i -> i / 2)
            .sum();
  }

  private static int sockMerchant2(int n, int[] ar) {
    return Arrays.stream(ar)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values()
            .stream()
            .map(Long::intValue)
            .mapToInt(i -> i / 2)
            .sum();
  }
}