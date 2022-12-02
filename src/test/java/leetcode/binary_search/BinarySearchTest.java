package leetcode.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    public void initialize() {
        this.binarySearch = new BinarySearch();
    }

    @Test
    public void emptyInput() {
        int expected = -1;
        int actual = binarySearch.search(new int[]{}, 9);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeExample1Test() {
        int expected = 4;
        int actual = binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeExample2Test() {
        int expected = -1;
        int actual = binarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeExample3Test() {
        int expected = 0;
        int actual = binarySearch.search(new int[]{5}, 5);
        assertEquals(expected, actual);
    }
}
