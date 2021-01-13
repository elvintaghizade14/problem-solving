package hackerrank.java;

import java.util.*;
import java.util.stream.IntStream;

public class JavaStackMedium {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String input = sc.next();
      //Complete the code
      System.out.println(isBalanced(input));
    }
  }

  private static boolean isBalanced(String line) {
    if (isBadInput(line)) return false;
    Stack<Character> chars = new Stack<>();
    ArrayList<Character> remains = new ArrayList<>();
    IntStream.range(0, line.length()).forEach(i -> {
      char curr = line.charAt(i);
      if (isOpen(curr)) chars.add(curr);
      else if (!chars.isEmpty() && isClosedCorrectly(chars.peek(), curr)) chars.pop();
      else remains.add(curr);
    });
    return remains.isEmpty();
  }

  private static boolean isBadInput(String s) {
    return (s.isEmpty()) || (s.length() % 2 == 1) || !isOpen(s.charAt(0));
  }

  private static boolean isOpen(char c) {
    final List<Character> OPENS = Arrays.asList('{', '[', '(');
    return OPENS.contains(c);
  }

  private static boolean isClosedCorrectly(char prev, char curr) {
    final Map<Character, Character> map = new HashMap<>();
    map.put('{', '}');
    map.put('[', ']');
    map.put('(', ')');
    return curr == map.get(prev);
  }
}
