package az.et.job_interviews.sample_test;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static List<Integer> oddNumbers(int l, int r) {
        l = l % 2 == 0 ? l + 1 : l;
        r = r % 2 == 0 ? r - 1 : r;

        List<Integer> odds = new ArrayList<>();
        for (int i = l; i <= r; i += 2) {
            odds.add(i);
        }

        return odds;
    }

}
