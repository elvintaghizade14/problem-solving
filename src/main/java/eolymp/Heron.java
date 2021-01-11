package eolymp;

import java.util.Scanner;

/**
 * url: https://www.e-olymp.com/en/contests/19072/problems/204033
 */
public class Heron {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    double f = sc.nextDouble();

    double areaOfQuad = calcAreaTriangle(a, b, f) + calcAreaTriangle(c, d, f);

    System.out.printf("%.4f\n", areaOfQuad);
  }

  private static double calcAreaTriangle(double a, double b, double c) {
    final double semiP = (a + b + c) / 2;
    return Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));
  }
}