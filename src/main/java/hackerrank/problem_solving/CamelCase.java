package hackerrank.problem_solving;

public class CamelCase {
  static int camelcase(String s) {
    return (int) (s.chars().filter(c -> c > 64 && c < 92).count() + 1);
  }

  public static void main(String[] args) {
    System.out.println(camelcase("saveChangesInTheEditor"));
  }
}
