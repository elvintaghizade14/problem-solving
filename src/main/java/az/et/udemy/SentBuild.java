package az.et.udemy;

import java.util.Scanner;
import java.util.StringJoiner;

public class SentBuild {
  private final static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // 1. input
    int count = sc.nextInt();
    String ch = sc.next();
    boolean newL = sc.nextBoolean();

    // 2. process
    String result = makeSentence(count, ch, newL);

    // 3. output
    System.out.println(result);
  }

  private static String makeSentence(int count, String ch, boolean newL) {
    String delimiter = newL ? ",\n " : "";
    StringJoiner sj = new StringJoiner(delimiter, "[", "]");
    for (int i = 0; i < count; i++) {
      sj.add(ch);
    }
    return sj.toString();
  }
}
