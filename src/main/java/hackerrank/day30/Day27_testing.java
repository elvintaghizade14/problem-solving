package hackerrank.day30;

public class Day27_testing {
  static class TestDataEmptyArray {
    public static int[] get_array() {
      return new int[0];
    }
  }

  static class TestDataUniqueValues {
    public static int[] get_array() {
      return new int[]{1, 2};
    }

    public static int get_expected_result() {
      return 0;
    }
  }

  static class TestDataExactlyTwoDifferentMinimums {
    public static int[] get_array() {
      return new int[]{1, 2, 1, 3};
    }

    public static int get_expected_result() {
      return 0;
    }
  }
}
