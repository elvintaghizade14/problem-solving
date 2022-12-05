package az.et.eolymp;

import java.util.Scanner;

public class RandomPointInACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int minA = a - 1;
        int maxA = a + 1;
        int minB = b - 1;
        int maxB = b + 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%.6f %.6f\n",
                    Math.random() * (maxA - minA + 1) + minA,
                    Math.random() * (maxB - minB + 1) + minB
            );
        }

    }
}
