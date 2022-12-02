package leetcode.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumbersWithEvenNumberOfDigitsTest {
    private FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits;

    @BeforeEach
    public void initialize() {
        this.findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
    }

    @Test
    public void emptyInputTest() {
        int expected = 0;
        int actual = findNumbersWithEvenNumberOfDigits.findNumbers(new int[]{});
        assertEquals(expected, actual);
    }

    @Test
    public void noEvenNumberTest() {
        int expected = 0;
        int actual = findNumbersWithEvenNumberOfDigits.findNumbers(new int[]{1, 137, 956});
        assertEquals(expected, actual);
    }

    @Test
    public void allEvenNumberTest() {
        int expected = 3;
        int actual = findNumbersWithEvenNumberOfDigits.findNumbers(new int[]{145089, 12, 9568});
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeExample1Test() {
        int expected = 2;
        int actual = findNumbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896});
        assertEquals(expected, actual);
    }

    @Test
    public void leetcodeExample2Test() {
        int expected = 1;
        int actual = findNumbersWithEvenNumberOfDigits.findNumbers(new int[]{555, 901, 482, 1771});
        assertEquals(expected, actual);
    }
}
