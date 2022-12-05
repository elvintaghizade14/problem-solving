package az.et.udemy;

import java.util.Scanner;

public class SignApp {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int input = sc.nextInt();

    // 2. process
    int result = sign(input);

    // 3. output
    System.out.println(result);
  }

  private static int sign(int value) {
//    return Integer.compare(value, 0);
    return value < 0 ? -1 : (value == 0 ? 0 : 1);
  }


}
