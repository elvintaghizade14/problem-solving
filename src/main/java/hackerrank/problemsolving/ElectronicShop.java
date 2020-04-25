package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ElectronicShop {

  public static void main(String[] args) {
    System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
  }

  private static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int[] sortedDrives = drives.clone();
    Arrays.sort(sortedDrives);
    int[] sortedKeyboards = keyboards.clone();
    Arrays.sort(sortedKeyboards);

    throw new IllegalArgumentException("Not implemented yet...");
  }
}
