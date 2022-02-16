package com.hackerrank.ipk.one_week_prep.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        final int[] input = arr.stream().mapToInt(num -> num).toArray();
        final int[] counts = IntStream.range(0, 100).map(i -> 0).toArray();
        for (int num : input) counts[num] = counts[num] + 1;
        return Arrays.stream(counts).boxed().collect(Collectors.toCollection(() -> new ArrayList<>(100)));
    }

}
