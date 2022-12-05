package az.et.hackerrank.interview_prep;

import java.util.stream.IntStream;

public class ArrayManipulation {
  public static void main(String[] args) {
    int[][] input = new int[][]{{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
    System.out.println(arrayManipulation(5,   input));
    System.out.println(arrayManipulation(10, input));
  }

  static long arrayManipulation(int n, int[][] queries) {
    long[] myList = IntStream.range(0, n).mapToLong(i -> 0).toArray();
    long max = 0;
    for (int[] query : queries) {
      int a = query[0] - 1;
      int b = query[1] - 1;
      int k = query[2];
      for (int i = a; i <= b; i++) {
        myList[i] += k;
        max = Math.max(max, myList[i]);
      }
    }
//    return max;
    throw new RuntimeException("Timeout happens when submit on hackerrank! MAKE OPTIMIZATIONS!!!");
  }
}