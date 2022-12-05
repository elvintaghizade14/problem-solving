package az.et.leetcode.guide.beginner;

public class RunningSumOfArray {

    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] sums = new int[len];

        sums[0] = nums[0];
        for (int i = 1; i < len; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        return sums;
    }

}
