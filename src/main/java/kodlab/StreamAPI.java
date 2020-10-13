package kodlab;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {
  public static void main(String[] args) {
    String line = "SJDHFSGUDFWSBDFHIOWEVDOABNWDOQWEID";

    System.out.println(getKeyValue(line));
  }

  public static Map<Character, Long> getKeyValue(String line) {
    return line.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}