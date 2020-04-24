package hackerrank.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class GradingStudents {
  public static void main(String[] args) {
    System.out.println(gradingStudents1(Arrays.asList(73, 67, 38, 33)));
    System.out.println(gradingStudents2(Arrays.asList(73, 67, 38, 33)));
    System.out.println(gradingStudents3(Arrays.asList(73, 67, 38, 33)));
  }

  public static List<Integer> gradingStudents1(List<Integer> grades) {
    List<Integer> results = new ArrayList<>();
    grades.forEach(grade -> {
      if (grade < 38) results.add(grade);
      else results.add(5 - grade % 5 < 3 ? grade - grade % 5 + 5 : grade);
    });
    return results;
  }

  public static List<Integer> gradingStudents2(List<Integer> grades) {
    return grades.stream()
            .map(grade -> grade > 37 && 5 - grade % 5 < 3 ? grade + 5 - grade % 5 : grade)
            .collect(Collectors.toList());
  }

  public static List<Integer> gradingStudents3(List<Integer> grades) {
    return grades
            .stream()
            .map(grade -> {
              int r = 5 - grade % 5;
              return grade > 37 && r < 3 ? grade + r : grade;
            })
            .collect(Collectors.toList());
  }
}
