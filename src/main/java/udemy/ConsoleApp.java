package udemy;

import java.util.Scanner;

public class ConsoleApp {
  private final static Scanner sc = new Scanner(System.in);

  public static int readInt() {
    return sc.nextInt();
  }

  public static String readLine() {
    return sc.nextLine();
  }

  public static void print(String line) {
    System.out.print(line);
  }

  public static void printLn(String line) {
    System.out.println(line);
  }
}