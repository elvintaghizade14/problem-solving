package hackerrank.interview_prep;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
  @Override
  public int compare(Player a, Player b) {
    return a.score != b.score ?
            b.score - a.score :
            a.name.compareTo(b.name);
  }
}
