package hackerrank.problem_solving;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModifiedKaprekarNumbers {
  private final static String INVALID = "INVALID RANGE";

  static class Triple<A,B,C> {
    final A a;
    final B b;
    final C c;

    Triple(A a, B b, C c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    Triple(A a, Pair<B,C> p) {
      this(a, p.a, p.b);
    }
  }

  static class Pair<A,B> {
    final A a;
    final B b;

    Pair(A a, B b) {
      this.a = a;
      this.b = b;
    }
  }

  static long sq(long n) {
    return n * n;
  }

  static String iToS(long n) {
    return Long.toString(n);
  }

  static int sToi(String s) {
    return s.isEmpty() ? 0 : Integer.parseInt(s);
  }

  static int len(int n) {
    return iToS(n).length();
  }

  static Pair<Integer, Integer> split(long n, int at) {
    String ns = iToS(n);
    return new Pair<>(
            sToi(ns.substring(0, ns.length() - at)),
            sToi(ns.substring(ns.length() - at))
    );
  }

  static void kaprekarNumbers(int p, int q) {
    String result = IntStream.rangeClosed(p, q)
            .mapToObj(n -> new Triple<>(n, split(sq(n), len(n))))
            .filter(t -> t.a == t.b + t.c)
            .map(t -> t.a)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.println(result.isEmpty() ? INVALID : result);
  }
}