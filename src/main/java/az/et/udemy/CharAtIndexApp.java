package az.et.udemy;

import java.util.Scanner;

public class CharAtIndexApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    String line = sc.nextLine();
    int index = sc.nextInt();

    // 2. process
    char c = charAtIndex(line, index);

    // 3. output
    System.out.println(c);
  }

  private static char charAtIndex(String line, int index) {
    return line.charAt(index);
  }
}
