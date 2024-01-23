package az.et.cci.questions.chapter01.string;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Task: "Implement an algorithm to determine if a string has all unique characters."
 */
public class AllUniqueCharsApp {

    public static void main(String[] args) {
        System.out.println(isAllUniqueVersion1("abcde"));
    }

    public static boolean isAllUniqueVersion1(final String s) {
        return s.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(occurrence -> occurrence > 1)
                .findFirst()
                .map(num -> Boolean.FALSE)
                .orElse(Boolean.TRUE);
    }
}