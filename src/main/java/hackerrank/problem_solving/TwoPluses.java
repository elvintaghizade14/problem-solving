package hackerrank.problem_solving;

import java.util.stream.IntStream;

public class TwoPluses {
  static final int FREE = 0;
  static final int OCCUPIED = 1;
  static final int BUSY = 9;

  static int[][] convert(String[] grid) {
    int dimY = grid.length;
    int dimX = grid[0].length();
    int[][] data = new int[dimY][dimX];
    IntStream.range(0, dimY).forEach(y ->
            IntStream.range(0, dimX).forEach(x ->
                    data[y][x] = grid[y].charAt(x) == 'G' ? FREE : BUSY
            ));
    return data;
  }

  static boolean isFreeHorAt(int x, int y, int len, int[][] data) {
    return IntStream.range(0, len).allMatch(i -> data[y][x+i] == FREE);
  }

  static boolean isFreeVerAt(int x, int y, int len, int[][] data) {
    return IntStream.range(0, len).allMatch(i -> data[y+i][x] == FREE);
  }

  static boolean isPossibleAt(int x, int y, int size, int[][] data) {
    return isFreeHorAt(x, y+size/2, size, data)
            && isFreeVerAt(x+size/2, y, size, data);
  }

  static void putValHorAt(int x, int y, int len, int val, int[][] data) {
    IntStream.range(0, len).forEach(i -> data[y][x+i] = val);
  }

  static void putValVerAt(int x, int y, int len, int val, int[][] data) {
    IntStream.range(0, len).forEach(i -> data[y+i][x] = val);
  }

  static void occupyAt(int x, int y, int size, int[][] data) {
    putValHorAt(x, y+size/2, size, OCCUPIED, data);
    putValVerAt(x+size/2, y, size, OCCUPIED, data);
  }

  static void releaseAt(int x, int y, int size, int[][] data) {
    putValHorAt(x, y+size/2, size, FREE, data);
    putValVerAt(x+size/2, y, size, FREE, data);
  }

  static class PlusesAt {
    final int x1;
    final int y1;
    final int x2;
    final int y2;
    final int size1;
    final int size2;

    PlusesAt(int x1, int y1, int x2, int y2, int size1, int size2) {
      this.x1 = x1;
      this.y1 = y1;
      this.x2 = x2;
      this.y2 = y2;
      this.size1 = size1;
      this.size2 = size2;
    }
  }

  static class PlusesRes {
    public final boolean fit;
    public final int size1;
    public final int size2;

    PlusesRes(boolean fit, int size1, int size2) {
      this.fit = fit;
      this.size1 = size1;
      this.size2 = size2;
    }

    public static PlusesRes yes(int size1, int size2) {
      return new PlusesRes(true, size1, size2);
    }

    public static PlusesRes no(int size1, int size2) {
      return new PlusesRes(false, size1, size2);
    }
  }

  static PlusesRes tryToFit(PlusesAt ps, int[][] data) {
    if (isPossibleAt(ps.x1, ps.y1, ps.size1, data)) {
      occupyAt(ps.x1, ps.y1, ps.size1, data);
      if (isPossibleAt(ps.x2, ps.y2, ps.size2, data)) {
        releaseAt(ps.x1, ps.y1, ps.size1, data);
        return PlusesRes.yes(ps.size1, ps.size2);
      }
      releaseAt(ps.x1, ps.y1, ps.size1, data);
    }
    return PlusesRes.no(ps.size1, ps.size2);
  }

  private static int combine(PlusesRes pr) {
    int a1 = pr.size1 * 2 - 1;
    int a2 = pr.size2 * 2 - 1;
    return a1 * a2;
  }

  static int twoPluses(String[] grid) {
    int[][] data = convert(grid);
    int w = data[0].length;
    int h = data.length;
    int max_w = (w & 1) == 0 ? w - 1 : w;
    int max_h = (h & 1) == 0 ? h - 1 : h;
    int max_plus = Math.min(max_w, max_h);

    return
            IntStream.rangeClosed(1, max_plus)
                    .filter(s -> (s & 1) != 0)
                    .map(x -> max_plus + 1 - x)
                    .boxed().flatMap(size1 ->

                    IntStream.rangeClosed(1, max_plus)
                            .filter(s -> (s & 1) != 0)
                            .map(x -> max_plus + 1 - x)
                            .boxed().flatMap(size2 ->

                            IntStream.rangeClosed(0, w - size1).boxed().flatMap(x1 ->
                                    IntStream.rangeClosed(0, h - size1).boxed().flatMap(y1 ->
                                            IntStream.rangeClosed(0, w - size2).boxed().flatMap(x2 ->
                                                    IntStream.rangeClosed(0, h - size2).boxed().map(y2 ->
                                                            new PlusesAt(x1, y1, x2, y2, size1, size2)
                                                    ))))))

                    .map(ps -> tryToFit(ps, data))
                    .filter(pr -> pr.fit)
                    .mapToInt(pr -> combine(pr))
                    .max()
                    .orElseThrow(RuntimeException::new);
  }
}
