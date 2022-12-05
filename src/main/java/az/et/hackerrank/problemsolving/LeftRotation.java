package az.et.hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    int len = arr.size();
    d %= len;
    List<Integer> part1 = arr.subList(d, len);
    List<Integer> part2 = arr.subList(0, d);
    List<Integer> result = new ArrayList<>();
    result.addAll(part1);
    result.addAll(part2);
    return result;
  }
}
