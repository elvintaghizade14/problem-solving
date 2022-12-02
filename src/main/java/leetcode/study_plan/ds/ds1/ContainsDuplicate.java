package leetcode.study_plan.ds.ds1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count > 1)
                .map(count -> true)
                .findAny()
                .orElse(false);
    }

}
