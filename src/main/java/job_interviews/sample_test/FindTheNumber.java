package job_interviews.sample_test;

import java.util.List;

public class FindTheNumber {

    public static String findNumber(List<Integer> arr, int k) {
        for (Integer num : arr) if (num == k) return "YES";
        return "NO";
    }

}
