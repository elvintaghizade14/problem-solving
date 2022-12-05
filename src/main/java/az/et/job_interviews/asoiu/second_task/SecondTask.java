package az.et.job_interviews.asoiu.second_task;

import java.util.Arrays;
import java.util.Random;

public class SecondTask {
  public static void main(String[] args) {

    // generate 25 random number in (-100, 100)
    int[] origin = new Random().ints(25, -100, 100).toArray();

    // turn positive all negtives inside it (do not change on original data make copy and change on it)
    int[] result = convertNegativesToPositive(origin);

    // print origin data and calculated data loop (for-each or enhanced for loop)
    for (int num : origin) System.out.print(num + " ");
    System.out.println();
    for (int num : result) System.out.print(num + " ");

    // with stream
    // Arrays.stream(origin).forEach(num -> System.out.print(num + " "));
    // Arrays.stream(result).forEach(num -> System.out.print(num + " "));

    // with Arrays.toString();
    // this methods allows you to print arrays in a good style out of the box: Arrays.toString();
    // System.out.println(Arrays.toString(origin));
    // System.out.println(Arrays.toString(result));
  }

  public static int[] convertNegativesToPositive(int[] origin) {
    int[] copied = Arrays.copyOf(origin, origin.length);
    for (int i = 0; i < copied.length; i++) {
      if (copied[i] < 0) copied[i] = Math.abs(copied[i]); // make positive
    }
    return copied;
  }
}

