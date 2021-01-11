package eolymp;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintArray3 {
  public static void main1(String[] args) {
    Scanner sc = new Scanner(System.in);
    String result = IntStream.range(0, sc.nextInt())
            .map(i -> sc.nextInt())
            .filter(num -> num > 0)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.println(result.trim().isEmpty() ? "NO" : result);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).toArray();
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for (int num : nums) {
      if (num > 0) {
        count++;
        sb.append(num).append(" ");
      }
    }
    if (count == 0) System.out.println("NO");
    else {
      System.out.println(count);
      System.out.println(sb.toString());
    }
  }
}