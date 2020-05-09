package hackerrank.problem_solving;

public class HallowenSale {
  public static void main(String[] args) {
    System.out.println(howManyGames(20, 3, 6, 80));
    System.out.println(howManyGames(20, 3, 6, 85));
  }

  private static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy
    int count = 0;
    while (s >= p) {
      count++;
      System.out.printf("p: %d, s: %d, count = %d\n", p, s, count);
      s -= p;
      if (p > m && p - d > m) p -= d;
      else {
        s -= m;
        p = 6;
      }
    }
//    return count;
    throw new IllegalArgumentException("Need to implement...");
  }
}