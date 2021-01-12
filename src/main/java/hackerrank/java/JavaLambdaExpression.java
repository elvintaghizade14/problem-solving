package hackerrank.java;

public class JavaLambdaExpression {
  interface PerformOperation {
    boolean check(int num);
  }

  class MyMath {
    public boolean checker(PerformOperation p, int num) {
      return p.check(num);
    }

    public PerformOperation isOdd() {
      return n -> (n & 1) == 1;
    }

    public PerformOperation isPrime() {
      // O(n^(1/2)) runtime
      return n -> {
        if (n < 2) {
          return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
          if (n % i == 0) {
            return false;
          }
        }
        return true;
      };
    }

    public PerformOperation isPalindrome() {
      return n -> {
        String original = Integer.toString(n);
        String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
        return original.equals(reversed);
      };
    }
  }
}
