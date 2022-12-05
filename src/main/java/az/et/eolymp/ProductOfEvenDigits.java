package az.et.eolymp;

import java.util.Scanner;

public class ProductOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());
        long prod = 1;

        while (n > 0) {
            long lastDigit = n % 10;
            if (lastDigit != 0 && lastDigit % 2 == 0) prod *= lastDigit;
            n /= 10;
        }

        if (prod == 1) System.out.println(-1);
        else System.out.println(prod);
    }
}
