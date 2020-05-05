package hackerrank.problem_solving;

public class JumpingOnClouds {
  public static void main(String[] args) {
    System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));
  }

  private static int jumpingOnClouds(int[] c) {
    final int SAFE = 0;
    int len = c.length;
    int count = 0;
    int idx = 0;
    while (idx < len - 1) {
      if (idx + 2 < len && c[idx + 2] == SAFE) {
        count++;
        idx += 2;
        continue;
      }
      if (idx + 1 < len && c[idx + 1] == SAFE) {
        count++;
        idx += 1;
        continue;
      }
      throw new RuntimeException("no way");
    }
    return count;
  }
}