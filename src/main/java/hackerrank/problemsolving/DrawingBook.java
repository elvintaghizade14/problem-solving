package hackerrank.problemsolving;

public class DrawingBook {
  public static void main(String[] args) {
    System.out.println(pageCount(6, 2));
    System.out.println(pageCount(5, 4));
  }

  private static int pageCount(int n, int p) {
    int from_left = p % 2 == 0 ? count(p + 1) : count(p);
    int from_right = n / 2 - from_left;
    return Math.min(from_left, from_right);
  }

  private static int count(int p) {
    return (p - 1) / 2;
  }
}