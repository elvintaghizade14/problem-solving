package az.et.job_interviews.sample_test;

import java.util.List;

public class FindTheNumber {

    public static String findNumber(List<Integer> arr, int target) {
        final Integer t = target;
        for (Integer num : arr) if (num.equals(t)) return "YES";
        return "NO";
    }

}