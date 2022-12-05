package az.et.hackerrank.interview_prep.one_week_prep_kit.day1;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        int length = arr.size();

        for (int curr : arr) {
            if (curr > 0) countPos++;
            else if (curr < 0) countNeg++;
            else countZero++;
        }

        System.out.printf("%.6f\n", (double) countPos / length);
        System.out.printf("%.6f\n", (double) countNeg / length);
        System.out.printf("%.6f\n", (double) countZero / length);
    }
}
