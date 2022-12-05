package az.et.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSortApp {
  static class Student implements Comparable<Student> {
    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
    }

    public int getId() {
      return id;
    }

    public String getFname() {
      return fname;
    }

    public double getCgpa() {
      return cgpa;
    }

    @Override
    public int compareTo(Student s2) {
      if (this.getCgpa() != s2.getCgpa()) return Double.compare(s2.getCgpa(), this.getCgpa());
      else if (!this.getFname().equals(s2.getFname())) return this.getFname().compareTo(s2.getFname());
      else return this.getId() - s2.getId();
    }
  }

  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<Student>();
    Collections.sort(studentList);

  }
}