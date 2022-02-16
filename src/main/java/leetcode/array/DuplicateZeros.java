package com.leetcode.array;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int countOfZeros = 0;
        for (int num : arr) if (num == 0) countOfZeros++;
        int len = arr.length;
        int[] duplicated = new int[len + countOfZeros];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) duplicated[j] = duplicated[j++ + 1] = 0;
            else duplicated[j] = arr[i];
            j++;
            arr[i] = duplicated[i];
        }
    }
}
