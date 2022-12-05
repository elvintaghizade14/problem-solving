package az.et.danit.hw.homework1.solution.util;

public class RandomGenerator {

  /**
   *
   * @param start inclusive
   * @param end inclusive
   * @return random int
   */
  public static int generateNumber(final int start, final int end) {
    return (int) (Math.random() * (end - start + 1) + start);
  }

}