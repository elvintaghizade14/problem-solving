package eolymp;

import java.util.Scanner;

public class TwoDigitsInARow {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int lastDigit = num % 10;
        int thirdDigit = (num / 10) % 10;
        int secondDigit = (num / 100) % 10;
        int firstDigit = num / 1000;

        if (firstDigit == 3 && secondDigit == 7 ||
                secondDigit == 3 && thirdDigit == 7 ||
                thirdDigit == 3 && lastDigit == 7
        ) System.out.println("YES");
        else System.out.println("NO");
    }
}
