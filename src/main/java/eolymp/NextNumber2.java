package eolymp;

import java.util.Scanner;

public class NextNumber2 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int c = n % 10;

        if (n > 0) System.out.println(n + (10 - c));
        else if (n == 0) System.out.println(10);
        else System.out.println(n + Math.abs(c));
    }
}