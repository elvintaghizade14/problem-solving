package hackerrank.problem_solving;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 */
public class CaesarCipher {

  static class Info {
    final int min;
    final int max;
    final char c;
    final boolean isLetter;

    Info(int min, int max, char c, boolean isLetter) {
      this.min = min;
      this.max = max;
      this.c = c;
      this.isLetter = isLetter;
    }
  }

  private static boolean isLetter(int c) {
    return (c >= 'A' && c <= 'Z') ||
            (c >= 'a' && c <= 'z');
  }

  private static Info getInfo(int c) {
    if (c >= 'A' && c <= 'Z') return new Info(65, 90, (char) c, true);
    else if (c >= 'a' && c <= 'z') return new Info(97, 122, (char) c, true);
    else return new Info(0, 127, (char) c, false);
  }

  private static char getCipher(int k, int min, int c) {
    throw new IllegalArgumentException("Only remains this.");
  }

  static String caesarCipher(String s, int k) {
    k %= 26;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      Info charInfo = getInfo(s.charAt(i));
      if (charInfo.isLetter) sb.append(getCipher(k, charInfo.min, charInfo.c));
      else sb.append(charInfo.c);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(caesarCipher("middle-Outz", 2));
  }
}