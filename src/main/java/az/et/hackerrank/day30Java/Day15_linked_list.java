package az.et.hackerrank.day30Java;

import java.util.Scanner;

public class Day15_linked_list {
  public static Node insert(Node head, int data) {
    if (head == null) return new Node(data);
    Node curr = head;
    while (curr.next != null) curr = curr.next;
    curr.next = new Node(data);
    return head;
  }

  public static void display(Node head) {
    Node start = head;
    while (start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
//    System.out.println(ans.toString());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while (N-- > 0) {
      int value = sc.nextInt();
      head = insert(head, value);
    }

    display(head);
    sc.close();
  }
}

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}
