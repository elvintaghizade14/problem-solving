package job_interviews.aws2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonFreshPromo {
    private static final String SPACE = " ";

    public static void main(String[] args) {
        System.out.println(foo(
                Collections.singletonList("apple apple banana anything banana"),
                Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana")
        ));

        System.out.println(foo(
                Collections.singletonList("apple apple banana anything banana"),
                Arrays.asList("banana", "orange", "banana", "apple", "apple")
        ));

        System.out.println(foo(
                Collections.singletonList("apple apple banana anything banana"),
                Arrays.asList("apple", "banana", "apple", "banana", "orange", "banana")
        ));
    }

    public static int foo(List<String> codeList, List<String> shoppingCart) {
        if (codeList.isEmpty()) return 1;

        final List<List<String>> secretCodes = codeList.stream().map(secretGroup -> Arrays.asList(secretGroup.split(SPACE))).collect(Collectors.toList());
        int secretIndex = 0;
        boolean consistent = true;
        return 0;
    }
}
