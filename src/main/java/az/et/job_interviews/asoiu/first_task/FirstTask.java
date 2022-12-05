package az.et.job_interviews.asoiu.first_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstTask {
  public static void main(String[] args) {
    // these are inputs:
    List<Student> students = Arrays.asList(
            new Student("Nasir", 25, 25, 49),
            new Student("John", 10, 10, 10),
            new Student("Tesla", 25, 25, 50),
            new Student("Nikol", 5, 0, 20),
            new Student("Einstein", 25, 25, 50),
            new Student("Jackson", 15, 15, 18)
    );

    // find who fail and print them (if have) with a) stream, b) for-each loop
    // a) loop
    List<Student> whoFailList = findWhoFail(students);

    for (Student student : whoFailList) {
      System.out.println(student.showNameAndTotalScore());
    }

    // b) stream
    // findWhoFail(students).stream().map(Student::showNameAndTotalScore).forEach(System.out::println);
  }

  public static List<Student> findWhoFail(List<Student> students) {
    // find who fail with b) loop, a) stream

    // a) loop
    ArrayList<Student> failedList = new ArrayList<>();
    for (Student student : students) {
      if (student.getTotalScore() < 51) failedList.add(student);
    }
    return failedList;

    // b) stream
    // return students.stream().filter(student -> student.getTotalScore() < 51).collect(Collectors.toList());

  }

  public static void printTotalScore(Student student) {
    System.out.println(student.getTotalScore());
  }
}