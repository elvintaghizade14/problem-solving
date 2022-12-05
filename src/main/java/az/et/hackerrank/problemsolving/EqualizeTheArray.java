package az.et.hackerrank.problemsolving;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EqualizeTheArray {
  public static void main(String[] args) {
    System.out.println(equalizeArray(new int[]{3, 3, 2, 1, 3}));
  }

  private static int equalizeArray(int[] arr) {
    return (int) (arr.length - Arrays.stream(arr)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values()
            .stream()
            .max(Long::compareTo)
            .orElseThrow(RuntimeException::new));
  }
}