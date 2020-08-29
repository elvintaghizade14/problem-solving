package eolymp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LengthOfWords {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // input
    String line = sc.nextLine();
    // process
    String result = Arrays.stream(line.split(" "))
            .mapToInt(String::length)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));
    // output
    System.out.println(result);
  }
}