package eolymp;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a == sc.nextInt() && a == sc.nextInt() && a == sc.nextInt()) System.out.print((long) a * a);
        else System.out.print("No");
    }
}
