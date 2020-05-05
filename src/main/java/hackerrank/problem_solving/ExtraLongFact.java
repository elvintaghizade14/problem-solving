package hackerrank.problem_solving;

import java.math.BigInteger;

public class ExtraLongFact {
  public static void main(String[] args) {

  }

  private static void extraLongFactorials(int n) {
    System.out.println(fact(BigInteger.valueOf(n)));
  }

  private static BigInteger fact(BigInteger n) {
    if (n.intValue() == 1) return BigInteger.ONE;
    return n.multiply(fact(n.subtract(BigInteger.ONE)));
  }
}
