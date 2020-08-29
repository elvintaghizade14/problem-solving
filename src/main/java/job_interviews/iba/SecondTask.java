package job_interviews.iba;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {2, 1, 5, 3, 6};

    List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> difference = Arrays.stream(b).filter(n -> !aList.contains(n)).boxed().collect(Collectors.toList());

    System.out.println(difference);
  }
}