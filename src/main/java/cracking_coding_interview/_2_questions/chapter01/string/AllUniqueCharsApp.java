package cracking_coding_interview._2_questions.chapter01.string;

public class AllUniqueCharsApp {

    /**
     * I will assume that our input is 128-bit ASCII encoded
     * Input: A n-length string
     * Time complexity is: O(N)
     * Space complexity is: O(128) = O(c) = O(1)
     */
    public boolean isAllUnique(final String s) {
        if (s.length() > 128) return false;

        final boolean[] charSet = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (charSet[ch]) return false;
            charSet[ch] = true;
        }
        return true;
    }
}