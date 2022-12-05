package az.et.eolymp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * url: <a href="https://www.e-olymp.com/en/contests/18542/problems/197890">...</a>
 */
public class ThreeDigitNumbers {
    public static void main(String[] args) {
        int sum = new Scanner(System.in).nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int num = 100; num < 1000; num++) {
            int last = num % 10;
            int mid = (num / 10) % 10;
            int first = num / 100;
            if (sum == (first + mid + last)) {
                nums.add(num);
            }
        }
        System.out.println(nums.size());
        nums.forEach(System.out::println);
    }
}
