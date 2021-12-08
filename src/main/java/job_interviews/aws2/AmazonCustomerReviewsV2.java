package job_interviews.aws2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonCustomerReviewsV2 {
    public static void main(String[] args) {
        List<List<String>> result = searchSuggestions(new ArrayList<>(Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad")), "mouse");
        for (List<String> keywords : result) {
            for (String keyword : keywords) {
                System.out.println(keyword);
            }
        }
    }

    public static List<List<String>> searchSuggestions(final List<String> repository, final String customerQuery) {
        if (customerQuery == null || customerQuery.length() < 2) return new ArrayList<>();
        final String queryLowered = customerQuery.toLowerCase();
        final List<List<String>> suggestions = new ArrayList<>();
        final List<String> newRepo = repository.stream().map(String::toLowerCase).collect(Collectors.toList());
        for (int endIdx = 2; endIdx <= queryLowered.length(); endIdx++) {
            final String subQuery = queryLowered.substring(0, endIdx);
            newRepo.removeIf(keyword -> !keyword.startsWith(subQuery));
            Collections.sort(newRepo);
            if (newRepo.size() > 3) suggestions.add(new ArrayList<>(newRepo.subList(0, 2)));
            else suggestions.add(new ArrayList<>(newRepo));
        }
        return suggestions;
    }
}
