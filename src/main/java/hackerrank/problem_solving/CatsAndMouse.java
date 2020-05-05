package hackerrank.problem_solving;

public class CatsAndMouse {
  public static void main(String[] args) {

  }

  private static String catAndMouse(int x, int y, int z) {
    int delta_t = Math.abs(z - x) - Math.abs(z - y);
    if (delta_t == 0) return "Mouse C";
    else if (delta_t < 0) return "Cat A";
    else return "Cat B";
  }
}
