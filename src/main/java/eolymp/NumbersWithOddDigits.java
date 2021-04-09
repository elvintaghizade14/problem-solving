package eolymp;

import java.util.Scanner;

public class NumbersWithOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int oddA = getOdd(a);
        int oddB = getOdd(b);

        for (int i = oddA; i <= oddB; i += 2) {
            System.out.print(i + " ");
        }

    }

    private static int getOdd(int n) {
        return n % 2 == 1 ? n : n + 1;
    }
}
