package eolymp;

import java.util.Scanner;
import java.util.stream.LongStream;

/**
 * url: https://www.e-olymp.com/az/contests/19073/problems/204047
 */
public class BetweenAandB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    int count = (int) LongStream.rangeClosed(a, b).filter(i -> i % x == 0).count();

    System.out.println(count);
  }
}