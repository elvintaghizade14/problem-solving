package az.et.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * url: https://www.e-olymp.com/en/contests/18687/problems/199589
 */
public class ArithmeticMeanForFigureSkaters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      List<Integer> grades = new ArrayList<>();
      for (int idx = 0; idx < n; idx++) {
        int nextInt = sc.nextInt();
        Integer integer = nextInt;
        grades.add(integer);
      }
      int count = 0;
      double sum = 0;
//      for (int grade : grades) {
//        if (grade != stats.getMax() || grade != stats.getMin()) {
//          sum += grade;
//          count++;
//        }
//      }
//      double avg = sum / count;
//      System.out.printf("%.2f ", avg);
//    }
    }
  }
}