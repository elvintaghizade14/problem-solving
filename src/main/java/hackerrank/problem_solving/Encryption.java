package hackerrank.problem_solving;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Encryption {
  public static void main(String[] args) {
    System.out.println(encryption("have a nice day"));
  }

  static String encryption(String s0) {
    String s = s0.replaceAll(" ", "");
    int len = s.length();
    double sqrt = Math.sqrt(len);
    int l1 = (int) Math.floor(sqrt);
    int l2 = (int) Math.ceil(sqrt);
    int cols = l2;
    int rows = l1 == l2 ? l1 : l1 * l2 < len ? l2 : l1;

    return IntStream.range(0, cols).boxed().flatMap(c ->
            IntStream.range(0, rows).boxed().map(r -> {
              // calculate index
              int idx = r * cols + c;
              // extract char
              String ch = idx < len ? String.valueOf(s.charAt(idx)) : "";
              // add extra space
              return r == rows - 1 ? ch + " " : ch;
            })
    ).collect(Collectors.joining());
  }
}
