package az.et.hackerrank.java;

public class JavaExceptionHandling {
  class MyCalculator {
    long power(int a, int b) throws Exception {
      if (a < 0 || b < 0) throw new Exception("n or p should not be negative.");
      if (a == b && b== 0) throw new Exception("n and p should not be zero.");
      return (long) Math.pow(a,b);
    }
  }
}
