package hackerrank.interview_prep;

import java.util.List;

public class MinimumAbsoluteDifference {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int l = arr.get(i);
                int r = arr.get(j);
                int diff = Math.min(Math.abs(l - r), Math.abs(r - l));
                min = Math.min(min, diff);
            }
        }
//        return min;
        throw new RuntimeException("Time limit exceed, should be implemented!!!");
    }

}
