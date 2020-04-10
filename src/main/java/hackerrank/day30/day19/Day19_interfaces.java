package hackerrank.day30.day19;

import java.util.Scanner;

public class Day19_interfaces {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();

    AdvancedArithmetic myCalculator = new Calculator();
    int sum = myCalculator.divisorSum(n);
    System.out.printf("I implemented: %s\n",
            myCalculator.getClass().getInterfaces()[0].getName());
    System.out.println(sum);
  }
}
