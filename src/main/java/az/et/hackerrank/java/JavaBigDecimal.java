package az.et.hackerrank.java;


import java.math.BigDecimal;

public class JavaBigDecimal {
  public static void main(String[] args) {
    String[] s = new String[10];

    BigDecimal[] decimals = new BigDecimal[9];
    for (int i = 0; i < decimals.length; i++) decimals[i] = new BigDecimal(s[i]);
    java.util.List<String> result = java.util.Arrays.stream(decimals)
            .sorted(java.util.Comparator.reverseOrder())
            .map(BigDecimal::toString)
            .collect(java.util.stream.Collectors.toList());
    java.util.stream.IntStream.range(0, result.size()).forEach(i -> s[i] = result.get(i));
  }
}