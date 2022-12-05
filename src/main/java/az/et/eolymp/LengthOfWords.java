package az.et.eolymp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LengthOfWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String result = Arrays.stream(sc.nextLine().split(" "))
              .mapToInt(String::length)
              .mapToObj(String::valueOf)
              .collect(Collectors.joining(" "));
      sc = new Scanner(System.in);
      System.out.println(result);
    }
  }
}