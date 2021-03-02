package eolymp;

import java.util.Scanner;

public class PointWithinACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xc = sc.nextInt();
        int yc = sc.nextInt();
        int r = sc.nextInt();
        int xp = sc.nextInt();
        int yp = sc.nextInt();

        if (Math.pow((xp - xc), 2) + Math.pow((yp - yc), 2) <= Math.pow(r, 2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
