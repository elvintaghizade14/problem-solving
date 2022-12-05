package az.et.hackerrank.problemsolving;

public class JumpingOnCloudRevisited {
  public static void main(String[] args) {
    System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
  }

  private static int jumpingOnClouds(int[] c, int k) {
    int n = c.length;
    int e = 100;
    int i = 0;
    while (true) {
      int next_idx = (i + k) % n;
      e += c[next_idx] == 0 ? -1 : -3;
      if (next_idx == 0) return e;
      i = next_idx;
    }
  }
}