package az.et.eolymp;

import java.util.Scanner;

import static java.lang.Math.log;

/**
 * url: https://www.e-olymp.com/en/contests/19072/problems/204025
 */
public class MassiveNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strings = sc.nextLine().split(" ");
    String[] first = strings[0].split("^");
    String[] second = strings[1].split("^");
    int a = toInt(first[0]);
    int b = toInt(first[1]);
    int c = toInt(second[0]);
    int d = toInt(second[1]);
    if (b * log(a) < d * log(c)) System.out.printf("%d^%d\n", c, d);
    else System.out.printf("%d^%d\n", a, b);
  }

  private static int toInt(String s) {
    return Integer.parseInt(s);
  }
}