package az.et.eolymp;

import java.util.Scanner;

public class PointOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a * x + b * y + c) == 0) System.out.println("YES");
        System.out.println("NO");
    }
}
