package az.et.hackerrank.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JSubstrCompare {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String s = sc.next();
    int k = sc.nextInt();
    String[] subs = new String[s.length() - k + 1];
    for (int i = 0; i < subs.length; i++) {
      subs[i] = s.substring(i, i + k);
    }
    String max = Arrays.stream(subs).max(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
    String min = Arrays.stream(subs).min(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
    System.out.println(max);
    System.out.println(min);
  }
}
