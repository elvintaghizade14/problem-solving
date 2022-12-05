package az.et.hackerrank.java;

public class JavaAnagrams {
  public static void main(String[] args) {
    System.out.println(isAnagram("Hello", "hello"));
    System.out.println(isAnagram("anagramm", "marganaa"));
    System.out.println(isAnagram("anagramm", "margana"));
  }

  private static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) return false;
    java.util.Map<Integer, Long> A = groupBy(a.toLowerCase());
    java.util.Map<Integer, Long> B = groupBy(b.toLowerCase());
    System.out.println(A);
    System.out.println(B);
    return A.equals(B);
  }

  private static java.util.Map<Integer, Long> groupBy(String a) {
    return a.chars()
            .boxed()
            .sorted()
            .collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.counting()));
  }
}
