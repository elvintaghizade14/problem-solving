package az.et.eolymp;

import java.util.Scanner;

public class SumOfSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    while (sc.hasNext()) {
      int num = sc.nextInt();
      sum += num;
    }
    System.out.println(sum);
  }
}
