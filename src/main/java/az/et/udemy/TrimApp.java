package az.et.udemy;

import java.util.Scanner;

public class TrimApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String line = sc.nextLine();
    sc.close();

    // 2. process
    String ans = normalize(line);

    // 3. output
    System.out.println(line);
    System.out.println(ans);
  }

  private static String normalize(String line) {
    String s = line.trim();
    throw new IllegalArgumentException("Not Implemented yet...");
//    return s;
  }
}
