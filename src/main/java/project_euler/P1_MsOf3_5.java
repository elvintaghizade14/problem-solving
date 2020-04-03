package project_euler;

import java.util.StringJoiner;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class P1_MsOf3_5 {
  public static void main(String[] args) {
    StringJoiner sj = new StringJoiner(", ", "[", "]");
    long sum = 0;
    for (int i = 1; i < 1000; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
        sj.add(String.valueOf(i));
      }
    }
    System.out.println(sj.toString());
    System.out.println(sum);
  }
}
