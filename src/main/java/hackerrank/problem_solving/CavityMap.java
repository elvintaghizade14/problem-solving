package hackerrank.problem_solving;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CavityMap {
  // grid[y].charAt(x) => at(x, y, grid)
  static int at(int x, int y, String[] grid) {
    return grid[y].charAt(x);
  }

  static boolean isCavityAt(int x, int y, String[] grid) {
    int c = at(x, y, grid);
    return x > 0 && y > 0
            && x < grid[y].length() - 1
            && y < grid.length - 1
            && c > at(x-1, y, grid)
            && c > at(x+1, y, grid)
            && c > at(x, y-1, grid)
            && c > at(x, y+1, grid);
  }

  static char solve(int x, int y, String[] grid) {
    return isCavityAt(x, y, grid) ? 'X' : (char) at(x, y, grid);
  }

  static String[] cavityMap(String[] grid) {
    return IntStream.range(0, grid.length).mapToObj(y ->
            IntStream.range(0, grid[y].length())
                    .mapToObj(x -> solve(x, y, grid))
                    .map(String::valueOf)
                    .collect(Collectors.joining())
    ).toArray(String[]::new);
  }
}
