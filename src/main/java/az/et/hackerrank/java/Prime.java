package az.et.hackerrank.java;

public class Prime {
  void checkPrime(int... nums) {
    for (int num : nums) {
      if (isPrime(num)) System.out.print(num + " ");
    }
    System.out.println();
  }

  private boolean isPrime(int n) {
    if (n < 2) return false;
    else if (n == 2) return true;
    else if (n % 2 == 0) return false;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 3; i <= sqrt; i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
}