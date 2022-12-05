package az.et.hackerrank.problemsolving;

public class ViralAdvertising {
  public static void main(String[] args) {
    System.out.println(viralAdvertising(5));
  }

  private static int viralAdvertising(int n) {
    int people = 5;
    int liked;
    int shared;
    int cum = 0;
    for (int i = 0; i < n; i++) {
      liked = people / 2;
      shared = liked * 3;
      cum += liked;
      people = shared;
    }
    return cum;
  }
}
