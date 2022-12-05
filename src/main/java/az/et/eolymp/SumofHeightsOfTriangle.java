package az.et.eolymp;

import java.util.Scanner;

/**
 * url: <a href="https://www.e-olymp.com/az/contests/19072/problems/204034">...</a>
 */
public class SumofHeightsOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final double c = sc.nextDouble();

        final double semiP = (a + b + c) / 2;
        final double area = Math.sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));

        System.out.printf("%.2f %.2f %.2f\n", calcHeight(a, area), calcHeight(b, area), calcHeight(c, area));
    }

    private static double calcHeight(double side, double area) {
        return (2 * area) / side;
    }

}
