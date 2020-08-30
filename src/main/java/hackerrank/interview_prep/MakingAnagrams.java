package hackerrank.interview_prep;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MakingAnagrams {
  static int makeAnagram(String a, String b) {
    int[] freqA = findFrequencies(a);
    int[] freqB = findFrequencies(b);

    return IntStream.range(0, 26)
            .map(i -> freqA[i] - freqB[i])
            .map(Math::abs)
            .sum();
  }

  private static int[] findFrequencies(String s) {
    int[] freq = new int[26];
    Arrays.fill(freq, 0);
    IntStream.range(0, s.length())
            .forEach(i -> freq[s.charAt(i) - 'a']++);
    return freq;
  }

  public static void main(String[] args) {
    System.out.println(makeAnagram("cde", "abc"));
    System.out.println(makeAnagram("cdse", "bbabc"));
  }
}