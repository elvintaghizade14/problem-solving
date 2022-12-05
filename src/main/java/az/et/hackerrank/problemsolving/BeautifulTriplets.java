package az.et.hackerrank.problemsolving;

import java.util.stream.IntStream;

public class BeautifulTriplets {

  static class Triplet {
    final int a;
    final int b;
    final int c;

    Triplet(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  }

  private static int diff(int a, int b) {
    return b - a;
  }

  static int beautifulTriplets(int d, int[] arr) {
    return (int) IntStream.range(0, arr.length - 3)
            .mapToObj(i -> new Triplet(arr[i], arr[i + 1], arr[i + 2]))
            .map(t -> new Triplet(diff(t.a, t.b), diff(t.b, t.c), d))
            .filter(t -> (t.a == t.b) && (t.a == d))
            .count();
  }

  public static void main(String[] args) {
    System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
    throw new IllegalArgumentException("Not implemented correctly");
  }
}
