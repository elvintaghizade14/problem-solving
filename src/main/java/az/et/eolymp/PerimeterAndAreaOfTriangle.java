package az.et.eolymp;

import java.util.Scanner;

/**
 * url: https://www.e-olymp.com/en/contests/19072/problems/204032
 */
public class PerimeterAndAreaOfTriangle {
  static class Point {
    public final double x;
    public final double y;

    Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public double getDist(Point that) {
      return Math.sqrt(
              Math.pow(getDiff(this.x, that.x), 2) + Math.pow(getDiff(this.y, that.y), 2)
      );
    }

    private double getDiff(double x, double y) {
      return y - x;
    }
  }

  static class Triangle {
    public final Point a;
    public final Point b;
    public final Point c;
    public final double ab;
    public final double ac;
    public final double bc;
    public final double perimeter;

    Triangle(Point a, Point b, Point c) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.ab = a.getDist(b);
      this.ac = a.getDist(c);
      this.bc = b.getDist(c);
      this.perimeter = (ab + bc + ac);

    }

    public double calcArea() {
      final double semiP = this.perimeter / 2;
      return Math.sqrt(semiP * (semiP - ab) * (semiP - bc) * (semiP - ac));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Triangle triangle = new Triangle(
            new Point(sc.nextDouble(), sc.nextDouble()),
            new Point(sc.nextDouble(), sc.nextDouble()),
            new Point(sc.nextDouble(), sc.nextDouble())
    );

    System.out.printf("%.4f %.4f", triangle.perimeter, triangle.calcArea());

  }
}