package hackerrank.day30Java;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day25_running_time_and_complexity {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int n = sc.nextInt();
      System.out.println(isPrime(n) ? "Prime" : "Not prime");
      t--;
    }
  }

  private static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
  }
}
