package az.et.eolymp;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * url: https://www.e-olymp.com/en/contests/18847/problems/201575
 */
public class CountTheLetters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toLowerCase();
    String c = sc.next().toLowerCase();
    sc.close();

    long count = IntStream.range(0, s.length())
            .filter(i -> c.equals(s.charAt(i)))
            .count();

    System.out.println(count);
  }
}