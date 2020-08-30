package hackerrank.interview_prep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoStrings {
  static String twoStrings(String s1, String s2) {
    final int MAX_CHAR = 26;
    boolean[] chars = new boolean[MAX_CHAR];
    Arrays.fill(chars, false);

    IntStream.range(0, s1.length())
            .forEach(i -> chars[s1.charAt(i) - 'a'] = true);

    for (int i = 0; i < s2.length(); i++) if (chars[s2.charAt(i) - 'a']) return "YES";
    return "NO";
  }
}
