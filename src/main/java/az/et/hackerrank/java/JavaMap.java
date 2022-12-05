package az.et.hackerrank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaMap {
  private static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int n = in.nextInt();
    in.nextLine();
    Map<String, Integer> phoneBook = new HashMap<>();
    IntStream.range(0, n)
            .mapToObj(i -> in.nextLine())
            .forEach(name -> {
                      int phone = in.nextInt();
                      phoneBook.put(name, phone);
                      in.nextLine();
                    }
            );
    while (in.hasNext()) {
      String query = in.nextLine();
      Integer number = phoneBook.getOrDefault(query, -1);
      String result = number == -1 ? "NotFound" : String.format("%s=%s", query, number);
      System.out.println(result);
    }
  }
}
