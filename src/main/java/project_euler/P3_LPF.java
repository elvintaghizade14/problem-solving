package project_euler;

import java.util.ArrayList;
import java.util.List;

public class P3_LPF {
  public static void main(String[] args) {
//    long n = 13195L;
    long n = 600851475143L;
    System.out.println(n);

    List<Integer> pfs = findPrimeFactors(n);
    System.out.println(pfs);
  }

  private static List<Integer> findPrimeFactors(long num) {
    List<Integer> pfs = new ArrayList<>();
    for (int i = 2; i <= num; i++) {
      if (num % i == 0) {
        num /= i;
        pfs.add(i);
        i--;
      }
    }
    return pfs;
  }
}