package az.et.hackerrank.problemsolving;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
  private static final Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> max = new Stack<>();
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int op = sc.nextInt();
      switch (op) {
        case 1:
          int num = sc.nextInt();
          stack.push(num);
          if (max.isEmpty() || max.peek() <= num) max.push(num);
          break;
        case 2:
          int pop = stack.pop();
          if (max.peek() == pop) max.pop();
          break;
        case 3:
          System.out.println(max.peek());
          break;
      }
    }
    sc.close();
  }
}