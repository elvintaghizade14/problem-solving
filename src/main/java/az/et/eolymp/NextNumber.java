package az.et.eolymp;

import java.util.Scanner;

/**
 * url: https://www.e-olymp.com/az/problems/8897
 */
public class NextNumber {
  public static void main(String[] args) {
    long num = new Scanner(System.in).nextLong();
    System.out.println(num);
    long a, b, c;
    a = num / 100;
    b = num % 100 / 10;
    c = num % 10;
    if (num > 0) System.out.println(num + (10 - c));
    else if (num == 0) System.out.println(10);
    else System.out.println(num + Math.abs(c));
  }
}