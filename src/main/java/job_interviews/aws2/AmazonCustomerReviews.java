package job_interviews.aws2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonCustomerReviews {
    public static void main(String[] args) {

    }

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        if (customerQuery == null || customerQuery.length() < 2) return new ArrayList<>(new ArrayList<>());
        final int length = customerQuery.length();
        final List<List<String>> results = new ArrayList<>(new ArrayList<>());
        List<String> keywords = new ArrayList<>();
        for (int i = 2; i <= length; i++) {
            int counter = 0;
            final String substring = customerQuery.substring(0, i);
            if (i == 2) {
                for (String keyword : repository) {
                    if (counter > 3) break;
                    if (keyword.startsWith(substring)) {
                        counter++;
                        keywords.add(keyword.toLowerCase());
                        Collections.sort(keywords);
                    }
                }
                if (keywords.size() > 2) keywords = keywords.subList(0, 3);
                results.add(keywords);
            } else {
                final List<String> continuedKeywords = new ArrayList<>();
                for (String keyword : keywords) {
                    if (counter > 3) break;
                    if (keyword.startsWith(substring)) {
                        counter++;
                        continuedKeywords.add(keyword.toLowerCase());
                        Collections.sort(continuedKeywords);
                    }
                }
                results.add(continuedKeywords);
                keywords = continuedKeywords;
            }
        }
        return results;
    }
}
