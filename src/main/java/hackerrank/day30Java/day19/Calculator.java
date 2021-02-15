package hackerrank.day30Java.day19;

import java.util.stream.IntStream;

public class Calculator implements AdvancedArithmetic {
  @Override
  public int divisorSum(int n) {
    return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).sum();
  }
}
