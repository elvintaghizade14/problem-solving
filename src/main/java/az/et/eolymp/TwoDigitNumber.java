package az.et.eolymp;

import java.util.Scanner;

public class TwoDigitNumber {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    if ((n > 9 && n < 100) || (n > -100 && n < -9)) System.out.println("Ok");
    else System.out.println("No");
  }
}

