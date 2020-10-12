package kodlab.linked_list;

import java.util.Objects;
import java.util.StringJoiner;

public class XLinkedList {
  static class Node {
    final int value;
    Node next;

    Node(int value) {
      this.value = value;
    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }
  }

  Node head;

  public void append(int value) {
    Node newNode = new Node(value);
    if (head == null) head = newNode;
    else {
      Node curr = head;
      while (curr.next != null) curr = curr.next;
      curr.next = newNode;
    }
  }

  public void prepend1(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    this.head = newNode;
  }

  public void prepend2(int value) {
    this.head = new Node(value, this.head);
  }

  public String represent1() {
    StringJoiner sj = new StringJoiner(",", "LinkedList:(", ")");
    Node curr = this.head;
    while (curr != null) {
      sj.add(String.valueOf(curr.value));
      curr = curr.next;
    }
    return sj.toString();
  }

  public String represent2() {
    StringJoiner sj = new StringJoiner(",", "LinkedList:(", ")");
    for (Node curr = head; curr != null; curr = curr.next) sj.add(String.valueOf(curr.value));
    return sj.toString();
  }

  public String represent3r() {
    StringJoiner sj = new StringJoiner(",", "LinkedList:(", ")");
    attach_next(this.head, sj);
    return sj.toString();
  }

  private void attach_next(Node curr, StringJoiner sj) {
    if (curr == null) return;
    sj.add(String.valueOf(curr.value));
    attach_next(curr.next, sj);
  }

  public int size() {
    int len = 0;
    for (Node curr = head; curr != null; curr = curr.next) len++;
    return len;
  }

  public int sizer() {
    return size_partial(this.head);
  }

  private int size_partial(Node from) {
    if (from == null) return 0;
    return size_partial(from.next) + 1;
  }

  public int sizetr() {
    return size_next(this.head, 0);
  }

  private int size_next(Node curr, int acc) {
    if (curr == null) return acc;
    return size_next(curr.next, acc + 1);
  }

  public boolean contains(int element) {
    Node curr = this.head;
    while (curr != null) {
      if (curr.value == element) return true;
      curr = curr.next;
    }
    return false;
  }

  public boolean containsr(int element) {
    return containsr_from(this.head, element);
  }

  private boolean containsr_from(Node curr, int element) {
    if (curr == null) return false;
    if (curr.value == element) return true;
    return containsr_from(curr.next, element);
  }

  public void reverse() {
    Node curr = this.head;
    Node prev = null;
    while (curr != null) {
      Node tempNext = curr.next;
      curr.next = prev;
      prev = curr;
      curr = tempNext;
    }
    this.head = prev;
  }

  private Node reverser(Node curr, Node prev) {
    if (curr == null) return prev;
    Node tempNext = curr.next;
    curr.next = prev;
    return reverser(tempNext, curr);
  }

  public void reverser() {
    this.head = reverser(this.head, null);
  }

  public void delete_head() {
    this.head = head.next;
  }

  public void delete_tail1() {
    Node curr = this.head;
    while (curr.next.next != null) curr = curr.next;
    curr.next = null;
  }

  public void delete_tail2() {
    Node curr = this.head;
    Node prev = null;
    while (curr.next != null) {
      prev = curr;
      curr = curr.next;
    }
    Objects.requireNonNull(prev).next = null;
  }




}