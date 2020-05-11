package hackerrank.java;

import java.util.Scanner;

/**
 * https://cheatography.com/davechild/cheat-sheets/regular-expressions/
 */
public class JavaStringTokens {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    s = s.trim();
    if (s.length() == 0) System.out.println(0);
    else {
      String[] chunks = s.split("[ !,?.\\\\_'@]+");
      System.out.println(chunks.length);
      for (String chunk : chunks) System.out.println(chunk);
    }
    scan.close();
  }
}