package az.et.eolymp;

import java.util.Scanner;

public class DivisibilityByDigits {
  public static void main(String[] args) {
    int a, c, d, f;
    int num = new Scanner(System.in).nextInt();
    a = num / 1000;
    c = num % 10;
    d = num % 10;
    f = num / 100;
    if (num % a == 0 && num % c == 0 && num % d == 0 && num % f == 0) System.out.println("YES");
    else System.out.println("NO");
    throw new RuntimeException("Not a good solution!");
  }
}