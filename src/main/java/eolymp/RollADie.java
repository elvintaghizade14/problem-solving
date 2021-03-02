package eolymp;

import java.util.Scanner;

public class RollADie {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++)
            System.out.print((int) (Math.random() * (6 - 1 + 1) + 1) + " ");
    }
}
