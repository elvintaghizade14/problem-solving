package com.hackerrank.ipk.one_week_prep.day1;

import java.util.List;
import java.util.stream.Collectors;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        List<Integer> nums = arr.stream().sorted().collect(Collectors.toList());
        return nums.get(nums.size() / 2);
    }
}
