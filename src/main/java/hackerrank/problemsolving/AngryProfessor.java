package hackerrank.problemsolving;

import java.util.Arrays;

public class AngryProfessor {
  public static void main(String[] args) {
    System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2}));
  }

  static String angryProfessor(int k, int[] a) {
    return Arrays.stream(a).filter(s -> s <= 0).count() < k ? "YES" : "NO";
  }
}