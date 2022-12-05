package az.et.eolymp;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            int num = in.nextInt();
            System.out.println(num + " is " + ((num % 2 == 0) ? "even" : "odd"));
        }
    }
}