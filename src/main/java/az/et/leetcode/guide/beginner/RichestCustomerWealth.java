package az.et.leetcode.guide.beginner;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int richestWealth = accounts[0][0];

        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int amount : account) {
                totalWealth += amount;
            }
            if (totalWealth > richestWealth) {
                richestWealth = totalWealth;
            }
        }

        return richestWealth;
    }

}
