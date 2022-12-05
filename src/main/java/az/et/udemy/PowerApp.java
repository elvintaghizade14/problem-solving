package az.et.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // 2. process
    String results = power(a, b, c);

    // 3. output
    System.out.println(results);
  }

  private static String power(int a, int b, int c) {
    List<Integer> results = new ArrayList<>();
    for (int i = a; i <= b; i++) {
      results.add((int) Math.pow(i, c));
    }
    return results.toString();
  }
}
