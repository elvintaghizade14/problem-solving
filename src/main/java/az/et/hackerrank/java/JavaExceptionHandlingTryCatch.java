package az.et.hackerrank.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int x = sc.nextInt();
      int y = sc.nextInt();
      System.out.println(x / y);
    } catch (InputMismatchException inputMismatchException) {
      System.out.println(inputMismatchException.getClass().getName());
    } catch (Exception e) {
      System.out.println(e.getClass().getName() + ": " + e.getMessage());
    }
    sc.close();
  }


}