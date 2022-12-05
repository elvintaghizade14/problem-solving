package az.et.eolymp;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            min = Math.min(sum, min);
            if (min == sum) result = num;
        }
        System.out.println(result);
    }
}
