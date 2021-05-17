package leetcode;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(
                new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(
                        new int[]{1, 1, 0, 1, 1, 1}
                )
        );
        System.out.println(
                new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(
                        new int[]{1, 0, 1, 1, 0, 1}
                )
        );
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 0) count = 0;
            else max = Math.max(max, ++count);
        }
        return max;
    }
}