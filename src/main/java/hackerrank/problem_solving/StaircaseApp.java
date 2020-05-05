package hackerrank.problem_solving;

import java.util.Scanner;

public class StaircaseApp {
  private static final Scanner scanner = new Scanner(System.in);

  private static void staircase(int n) {
    StringBuilder ans = new StringBuilder();
    for (int i = 0, c_count = 1; i < n; i++, c_count++) {
      int j = n;
      while (j > 0) {
        if (j > c_count) ans.append(' ');
        else ans.append("#");
        j--;
      }
      if (i != n - 1) ans.append("\n");
    }
    System.out.print(ans);
  }

  public static void main(String[] args) {
    int n = scanner.nextInt();
    staircase(n);
    scanner.close();
  }
}
