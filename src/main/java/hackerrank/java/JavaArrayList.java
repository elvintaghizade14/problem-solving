package hackerrank.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaArrayList {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    Map<Integer, List<Integer>> lines = new HashMap<>();
    IntStream.rangeClosed(1, n).forEach(key -> {
      List<Integer> line = IntStream.range(0, sc.nextInt())
              .map(j -> sc.nextInt())
              .boxed()
              .collect(Collectors.toList());
      lines.put(key, line);
    });

    System.out.println(lines);

    int q = sc.nextInt();
    IntStream.range(0, q)
            .map(i -> sc.nextInt()).forEach(x -> {
              int y = sc.nextInt() - 1;
              try {
                System.out.println(lines.get(x).get(y));
              } catch (Exception ex) {
                System.out.println("ERROR!");
              }
            }
    );
  }
}