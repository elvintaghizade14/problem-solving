package hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaHashSet {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String[] pair_left = new String[t];
    String[] pair_right = new String[t];

    IntStream.range(0, t).forEach(i -> {
      pair_left[i] = s.next();
      pair_right[i] = s.next();

    });

    java.util.HashSet<String> set = new HashSet<>();
    java.util.stream.IntStream.range(0, t).forEach(idx -> {
      set.add(String.format("%s %s", pair_left[idx], pair_right[idx]));
      System.out.println(set.size());
    });
  }
}
