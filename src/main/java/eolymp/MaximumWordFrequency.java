package eolymp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumWordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            map.put(
                    word,
                    map.getOrDefault(word, 0) + 1
            );
        }

    }
}
