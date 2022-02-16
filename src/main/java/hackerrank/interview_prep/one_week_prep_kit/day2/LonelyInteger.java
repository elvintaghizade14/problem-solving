package com.hackerrank.ipk.one_week_prep.day2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> arr) {
        final Map<Integer, Integer> nums = new HashMap<>();
        arr.forEach(num -> nums.put(num, nums.getOrDefault(num, 0) + 1));
        return nums.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
    }
}
