package hackerrank.interview_prep.one_week_prep_kit;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        final int firstItem = arr.get(0);
        int max = firstItem;
        int min = firstItem;
        long sum = firstItem;

        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if (max < curr) max = curr;
            if (min > curr) min = curr;
            sum += curr;
        }

        System.out.printf("%d %d", (sum - max), (sum - min));
    }
}