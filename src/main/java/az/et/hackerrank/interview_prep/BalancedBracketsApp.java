package az.et.hackerrank.interview_prep;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.IntStream;

public class BalancedBracketsApp {
  static String isBalanced(String s) {
    if (isBadInput(s)) return "NO";
    IntStream chars = s.chars();
    Stack<Integer> charStack = new Stack<>();
    ArrayList<Integer> remains = new ArrayList<>();
    chars.forEach(c -> {
      if (isOpen(c)) charStack.add(c);
      else if (isClosed(charStack.peek(), c)) charStack.pop();
      else remains.add(c);
    });
    return remains.size() == 0 ? "YES" : "NO";
  }

  private static boolean isBadInput(String s) {
    return (s.length() % 2 == 1) || !isOpen(s.charAt(0));
  }

  private static boolean isOpen(int character) {
    return character == '{' || character == '[' || character == '(';
  }

  private static boolean isClosed(int before, int after) {
    return (before == '(' && after == ')') ||
            (before == '[' && after == ']') ||
            (before == '{' && after == '}');
  }

  public static void main(String[] args) {
    System.out.println(isBalanced("[]][{]{(({{)[})(}[[))}{}){[{]}{})()[{}]{{]]]){{}){({(}]"));
    System.out.println(isBalanced("{(([])[])[]]}"));
    System.out.println(isBalanced("{(([])[])[]}[]"));
  }
}
