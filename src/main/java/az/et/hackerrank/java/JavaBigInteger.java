package az.et.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    BigInteger a = new BigInteger(s1);
    BigInteger b = new BigInteger(s2);
    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
    sc.close();
  }
}
