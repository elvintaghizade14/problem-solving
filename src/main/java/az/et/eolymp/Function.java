package az.et.eolymp;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.exp;
import static java.lang.Math.log10;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 * url: <a href="https://www.e-olymp.com/en/contests/19072/problems/204024">...</a>
 */
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double f = sin(x) + sqrt(log10(3 * x) / log10(4)) + ceil(3 * exp(x));
            System.out.printf("%.6f\n", f);
        }
    }
}
