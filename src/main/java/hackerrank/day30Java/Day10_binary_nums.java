package hackerrank.day30Java;

import java.util.Scanner;

public class Day10_binary_nums {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println(count1(decToBin1(sc.nextInt())));
  }

  private static int count1(String bin) {
    int count = 0;
    int max = 0;
    for (int i = 0; i < bin.length(); i++) {
      if (bin.charAt(i) == '1') count++;
      else count = 0;
      max = Math.max(max, count);
    }
    return max;
  }

  private static String decToBin1(int dec_num) {
    return Integer.toBinaryString(dec_num);
  }
}