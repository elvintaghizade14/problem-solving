package hackerrank.day30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day22_bst_height {

  static class Node {
    Node left, right;
    int data;

    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    } else {
      Node cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      } else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    Node root = null;
    while (T-- > 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    int height = getHeight(root);
    System.out.println(height);
  }

  public static int getHeight(Node root) {
//    throw new IllegalArgumentException("Not implemented yet...");
    if (root == null) return -1;
    int left = getHeight(root.left) + 1;
    int right = getHeight(root.right) + 1;
    return Math.max(left, right);
  }
}