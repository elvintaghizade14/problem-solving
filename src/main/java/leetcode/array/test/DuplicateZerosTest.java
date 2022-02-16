package com.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DuplicateZerosTest {
    private DuplicateZeros duplicateZeros;

    @BeforeEach
    public void initialize() {
        this.duplicateZeros = new DuplicateZeros();
    }

    @Test
    public void emptyInputTest() {
        int[] arr = {};
        duplicateZeros.duplicateZeros(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void noZeroTest() {
        int[] arr = {1, 2, 3};
        duplicateZeros.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void twoZeroTest() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

}
