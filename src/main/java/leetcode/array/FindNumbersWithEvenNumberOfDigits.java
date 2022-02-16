package com.leetcode.array;

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int countOfDigits = countDigits(num);
            if (isEvenNum(countOfDigits)) count++;
        }
        return count;
    }

    public int findNumbersV2(int[] nums) {
        return (int) Arrays.stream(nums)
                .map(this::countDigits)
                .filter(this::isEvenNum)
                .count();
    }

    public int findNumbersBadWay(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int countOfDigits = 0;
            while (num > 0) {
                countOfDigits++;
                num /= 10;
            }
            if (countOfDigits % 2 == 0) count++;
        }
        return count;
    }

    private int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    private boolean isEvenNum(int countOfDigits) {
        return countOfDigits % 2 == 0;
    }
}
