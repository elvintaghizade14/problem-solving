package az.et.hackerrank.problemsolving;

import java.util.stream.IntStream;

public class RepeatedStrings {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10L));
        System.out.println(repeatedString("a", 1000000000000L));
    }

    private static long repeatedString(String s, long n) {
        int len = s.length();
        long lenCount = s.chars().filter(c -> c == 'a').count();
        return lenCount * (n / len) + IntStream.range(0, (int) (n % len))
                .map(s::charAt)
                .filter(c -> c == 'a')
                .count();
    }
}
