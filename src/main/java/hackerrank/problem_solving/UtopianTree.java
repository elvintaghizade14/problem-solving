package hackerrank.problem_solving;

public class UtopianTree {
  public static void main(String[] args) {
    System.out.println(utopianTree(0));
    System.out.println(utopianTree(1));
    System.out.println(utopianTree(2));
    System.out.println(utopianTree(3));
    System.out.println(utopianTree(4));
    System.out.println(utopianTree(5));
  }

  private static int utopianTree(int n) {
    int h = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) h *= 2;
      else h += 1;
    }
    return h;
  }
}
