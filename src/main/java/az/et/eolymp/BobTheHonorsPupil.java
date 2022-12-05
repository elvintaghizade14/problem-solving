package az.et.eolymp;

import java.util.Scanner;

public class BobTheHonorsPupil {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        while (n > 0) {
            if ((n % 10) == 5) count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
