package az.et.eolymp;

import java.util.Scanner;

public class FourDigitArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++)
            if (i == calcSum(i))
                System.out.println(i);
    }

    private static int calcSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 4);
            n /= 10;
        }
        return sum;
    }
}