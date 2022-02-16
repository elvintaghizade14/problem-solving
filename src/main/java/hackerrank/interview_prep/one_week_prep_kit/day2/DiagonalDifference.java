package com.hackerrank.ipk.one_week_prep.day2;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftToRight = 0;
        int rightToLeft = 0;
        for (int r = 0; r < arr.size(); r++) {
            final List<Integer> row = arr.get(r);
            int rowSize = row.size() - 1;
            for (int c = 0; c <= rowSize; c++) {
                if (r == c) leftToRight += row.get(c);
                if (c == (rowSize - r)) rightToLeft += row.get(c);
            }
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}
