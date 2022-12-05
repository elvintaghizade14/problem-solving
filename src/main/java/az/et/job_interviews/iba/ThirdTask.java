package az.et.job_interviews.iba;

import java.util.Map;
import java.util.stream.Collectors;

public class ThirdTask {
  public static void main(String[] args) {
    String first = "Programming";
    String second = "Rpogmmaring";

    System.out.println(isSame(first, second) ? "YES" : "NO");
  }

  private static boolean isSame(String first, String second) {
    if (first.length() != second.length()) return false;
    Map<Integer, Long> fGroup = toGroup(first);
    Map<Integer, Long> sGroup = toGroup(second);
    for (int i = 0; i < fGroup.size(); i++) if (!fGroup.get(i).equals(sGroup.get(i))) return false;
    return true;
  }

  private static Map<Integer, Long> toGroup(String s) {
    return s.toLowerCase()
            .chars()
            .map(i -> (char) i)
            .boxed()
            .sorted()
            .collect(Collectors.groupingBy(o -> o, Collectors.counting()));
  }

}