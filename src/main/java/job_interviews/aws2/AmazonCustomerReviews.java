package job_interviews.aws2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonCustomerReviews {
    public static void main(String[] args) {
        List<List<String>> result = searchSuggestions(new ArrayList<>(Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad")), "mouse");
        for (List<String> keywords : result) System.out.println(keywords);
    }

    public static List<List<String>> searchSuggestions(final List<String> repository, final String customerQuery) {
        if (customerQuery == null || customerQuery.length() < 2) return new ArrayList<>();

        final List<List<String>> suggestions = new ArrayList<>();
        final String lowerCaseQuery = customerQuery.toLowerCase();
        final List<String> lowerCaseRepo = repository.stream().map(String::toLowerCase).collect(Collectors.toList());

        for (int endIndex = 2; endIndex <= lowerCaseQuery.length(); endIndex++) {
            final String subQuery = lowerCaseQuery.substring(0, endIndex);
            lowerCaseRepo.removeIf(keyword -> !keyword.startsWith(subQuery));
            Collections.sort(lowerCaseRepo);
            List<String> keywords;
            if (lowerCaseRepo.size() >= 3) keywords = new ArrayList<>(lowerCaseRepo.subList(0, 3));
            else keywords = new ArrayList<>(lowerCaseRepo);
            suggestions.add(keywords);
        }

        return suggestions;
    }
}
