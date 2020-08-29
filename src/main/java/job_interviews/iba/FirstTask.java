package job_interviews.iba;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FirstTask {
  private static final Scanner sc = new Scanner(System.in);

  public static void main1(String[] args) {
    String line = sc.nextLine();

    StringBuilder sb = new StringBuilder();
    for (int i = line.length() - 1; i >= 0; i--) sb.append(line.charAt(i));

    System.out.println(sb.toString());
  }

  public static void main2(String[] args) {
    String line = sc.nextLine();
    char[] origin = line.toCharArray();
    char[] reverse = new char[origin.length];
    int end = line.length() - 1;

    IntStream.rangeClosed(0, end).forEach(n -> reverse[n] = origin[end - n]);

    System.out.println(String.valueOf(reverse));
  }
}