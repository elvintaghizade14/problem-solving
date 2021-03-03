package eolymp;

import java.util.Scanner;

public class RabbitsInTheCells {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long k = m/n;
        if(m%n!=0)k++;

        System.out.println(k);
    }
}
