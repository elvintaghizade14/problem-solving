package az.et.udemy;

import java.util.Scanner;

public class AscedingApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    // 2. process
    boolean ans = isAscOrd(a, b, c, d);

    // 3. output
    System.out.println(ans ? "in ascending order" : "not ascending order");
  }

  private static boolean isAscOrd(int a, int b, int c, int d) {
    int[] nums = {a, b, c, d};
    for (int i = 0; i < 3; i++) {
      if (nums[i] > nums[i + 1]) return false;
    }
    return true;
  }
}
