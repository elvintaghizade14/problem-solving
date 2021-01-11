package eolymp;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * url: https://www.e-olymp.com/en/contests/19072/problems/204038
 */
public class SortTheLetters {
  public static void main(String[] args) {
    String line = new Scanner(System.in).next();
    List<Integer> chars = line.chars().boxed().sorted(Comparator.comparingInt(i -> i)).collect(Collectors.toList());

    for (int integer : chars) {
      System.out.print((char) integer);
    }
    System.out.println();
    chars.sort((i1, i2) -> i2 - i1);
    for (int integer : chars) {
      System.out.print((char) integer);
    }
  }
}