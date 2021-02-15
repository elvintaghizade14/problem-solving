package hackerrank.day30Java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18_queues_stacks {
  static Stack<Character> stack = new Stack<>();
  static Queue<Character> queue = new LinkedList<>();

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Day18_queues_stacks p = new Day18_queues_stacks();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length / 2; i++) {
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.printf("The word, %s, is %s\n",
            input, (!isPalindrome) ? "not a palindrome." : "a palindrome.");
  }

  private Character dequeueCharacter() {
    return queue.poll();
  }

  private Character popCharacter() {
    return stack.pop();
  }

  private void pushCharacter(char c) {
    stack.push(c);
  }

  private void enqueueCharacter(char c) {
    queue.add(c);
  }


}
