package hackerrank.java;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
  public static void main(String[] args) {

  }

  public static void fizzBuzz(int n) {
    // Write your code here
    String result = IntStream.rangeClosed(1, n)
            .mapToObj(i -> {
              if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
              else if (i % 3 == 0) return "Fizz";
              else if (i % 5 == 0) return "Buzz";
              else return String.valueOf(i);
            }).collect(Collectors.joining("\n"));
    System.out.println(result);
  }
}