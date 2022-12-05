package az.et.leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxConsecutiveOnesTest {
    private FindMaxConsecutiveOnes findMaxConsecutiveOnes;

    @BeforeEach
    public void initialize() {
        this.findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
    }

    @Test
    public void emptyInputTest() {
        int expected = 0;
        int actual = findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{});
        assertEquals(expected, actual);
    }

    @Test
    public void noConsecutiveTest() {
        int expected = 0;
        int actual = findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0, 0, 0, 0, 0, 0, 0});
        assertEquals(expected, actual);
    }

    @Test
    public void allConsecutiveTest() {
        int expected = 7;
        int actual = findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 1, 1, 1, 1, 1});
        assertEquals(expected, actual);
    }

    @Test
    public void leetCodeExample1Test() {
        int expected = 3;
        int actual = findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        assertEquals(expected, actual);
    }

    @Test
    public void leetCodeExample2Test() {
        int expected = 2;
        int actual = findMaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1});
        assertEquals(expected, actual);
    }
}
