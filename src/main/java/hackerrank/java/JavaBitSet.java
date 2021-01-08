package hackerrank.java;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
  static class Pair {
    public final BitSet first;
    public final BitSet second;

    Pair(BitSet first, BitSet second) {
      this.first = first;
      this.second = second;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    BitSet b1 = new BitSet(n);
    BitSet b2 = new BitSet(n);
    while (m-- > 0) {
      String op = sc.next();
      int a = sc.nextInt();
      int b = sc.nextInt();
      Pair pair = getFirstAndSecond(b1, b2, a);
      switch (op) {
        case "AND":
          pair.first.and(pair.second);
          break;
        case "OR":
          pair.first.or(pair.second);
          break;
        case "XOR":
          pair.first.xor(pair.second);
          break;
        case "FLIP":
          pair.first.flip(b);
          break;
        case "SET":
          pair.first.set(b);
          break;
      }
      System.out.println(b1.cardinality() + " " + b2.cardinality());
    }
    sc.close();
  }

  private static Pair getFirstAndSecond(BitSet b1, BitSet b2, int a) {
    if (a == 1) return new Pair(b1, b2);
    else return new Pair(b2, b1);
  }
}