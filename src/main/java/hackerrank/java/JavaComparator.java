package hackerrank.java;

import java.util.Comparator;

public class JavaComparator {
  static class Player {
    String name;
    int score;

    Player(String name, int score) {
      this.name = name;
      this.score = score;
    }
  }

  class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
      if (p1.score != p2.score) return Integer.compare(p2.score, p1.score);
      else return p1.name.compareTo(p2.name);
    }
  }

  public static void main(String[] args) {


  }
}
