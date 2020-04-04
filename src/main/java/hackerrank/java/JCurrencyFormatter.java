package hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JCurrencyFormatter {
  public static void main(String[] args) {
    // 1. input
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // 2. process
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

    // 3. output
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}
