package az.et.leetcode.study_plan.ds.ds1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void init() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void containsDuplicate_Should_ReturnTrue() {
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void containsDuplicate_Should_ReturnFalse() {
        assertFalse(containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void containsDuplicate_Should_ReturnTrue_2() {
        assertTrue(containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

}