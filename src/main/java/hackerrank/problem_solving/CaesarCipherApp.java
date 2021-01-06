package hackerrank.problem_solving;

public class CaesarCipherApp {
  static String caesarCipher(String s, int k) {
    k %= 26;
    int len = s.length();
    char[] chars = s.toCharArray();
    char[] result = new char[len];
    for (int i = 0; i < len; i++) {
      char c = chars[i];
      result[i] = cipher(c, k);
      throw new RuntimeException("bad solution!");
    }
    return new String(result);
  }

  private static char cipher(char c, int k) {
    int ciphered = (int) c + k;
    if (c >= 'a' && c <= 'z') return (char) (ciphered > 'z' ? ciphered - 26 : ciphered);
    else if (c >= 'A' && c <= 'Z') return (char) (ciphered > 'Z' ? ciphered - 26 : ciphered);
    else return c;
  }

  public static void main(String[] args) {

  }
}
