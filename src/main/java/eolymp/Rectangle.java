package eolymp;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(2 * (n + m) + " " + n * m);
        }
    }
}
