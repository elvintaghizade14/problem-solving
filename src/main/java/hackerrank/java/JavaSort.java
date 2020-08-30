package hackerrank.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaSort {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());

    List<Student> studentList = new ArrayList<>();
    while (testCases > 0) {
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();
      Student st = new Student(id, fname, cgpa);
      studentList.add(st);
      testCases--;
    }

    studentList = studentList.stream()
            .sorted(Comparator.comparingDouble(Student::getCgpa))
            .sorted(Comparator.comparing(Student::getFname))
            .sorted(Comparator.comparingInt(Student::getId))
            .collect(Collectors.toList());

    for (Student st : studentList) System.out.println(st.getFname());
  }
}
