package hackerrank.java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaList {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    List<Integer> l = IntStream.range(0, n)
            .mapToObj(i -> sc.nextInt())
            .collect(Collectors.toList());
    int q = sc.nextInt();
    for (int i = 0; i < q; i++) {
      switch (sc.next()) {
        case "Insert":
          int index = sc.nextInt(); // index
          int value = sc.nextInt(); // value
          l.add(index, value);
          break;
        case "Delete":
          int dIndex = sc.nextInt(); // index to delete
          l.remove(dIndex);
          break;
      }
    }
    String result = l.stream().map(String::valueOf).collect(Collectors.joining(" "));
    System.out.println(result);
  }
}