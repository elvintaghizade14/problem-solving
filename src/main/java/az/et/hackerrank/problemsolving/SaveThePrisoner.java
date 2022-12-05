package az.et.hackerrank.problemsolving;

public class SaveThePrisoner {
  public static void main(String[] args) {
    System.out.println(saveThePrisoner(5, 2, 1));
    System.out.println(saveThePrisoner(5, 2, 2));
    System.out.println(saveThePrisoner(7, 19, 2));
    System.out.println(saveThePrisoner(3, 7, 3));
    System.out.println(saveThePrisoner(352926151, 380324688, 94730870));
    System.out.println(saveThePrisoner(946486979, 973168361, 647886035));
  }

  /**
   * @param n -> number of prisoners
   * @param m -> number of candies
   * @param s -> the chair number to start passing out treats at
   * @return an integer representing the chair number of the prisoner to warn
   */
  private static int saveThePrisoner(int n, int m, int s) {
    int rem = (s + m - 1) % n;
    return rem == 0 ? n : rem;
  }
}
