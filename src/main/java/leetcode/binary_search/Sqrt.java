package com.leetcode.binary_search;

public class Sqrt {
    public int mySqrt(int x) {
        int n = 0;
        while (true) {
            long prod = (long) n * n;
            if (prod == x) return n;
            else if (prod > x) return n - 1;
            else n++;
        }
    }
}
