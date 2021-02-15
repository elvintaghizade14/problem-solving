package hackerrank.day30Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_map_and_dictionaries {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> phoneBook = new HashMap<>();
    for (int i = 0; i < n; i++) {
      phoneBook.put(in.next(), in.nextInt());
    }
    while (in.hasNext()) {
      String s = in.next();
      Integer num = phoneBook.get(s);
      System.out.println(num != null ? String.format("%s=%d", s, num) : "Not found");
    }
    in.close();
  }
}
