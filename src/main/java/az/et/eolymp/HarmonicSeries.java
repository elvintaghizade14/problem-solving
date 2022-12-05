package az.et.eolymp;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        double n = new Scanner(System.in).nextInt();

        double sum = 1;
        for (double i = 2; i <= n; i++) {
            sum += (1 / i);
        }

        System.out.printf("%.4f", sum);
    }
}
