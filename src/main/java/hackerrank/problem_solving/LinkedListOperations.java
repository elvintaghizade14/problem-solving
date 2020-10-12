package hackerrank.problem_solving;

import java.util.HashSet;

public class LinkedListOperations {

  static class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
      this.data = nodeData;
      this.next = null;
    }
  }

  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    newNode.next = null;
    SinglyLinkedListNode temp = head;
    if (temp == null) return newNode;
    while (temp.next != null) temp = temp.next;
    temp.next = newNode;
    return head;
  }

  static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode root = new SinglyLinkedListNode(data);
    root.next = head;
    return root;
  }

  static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    if (head == null || position == 0) return head.next;
    SinglyLinkedListNode temp = head;
    SinglyLinkedListNode prev = null;
    while (position != 0) {
      position--;
      prev = temp;
      temp = temp.next;
    }
    prev.next = temp.next;
    return head;
  }

  static int getNode(SinglyLinkedListNode head, int positionFromTail) {
    SinglyLinkedListNode temp = head;
    int size = 0;
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    int index = size - positionFromTail - 1;
    while (index != 0) {
      index--;
      head = head.next;
    }
    return head.data;
  }

  static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
    if (head == null) return null;
    SinglyLinkedListNode curr = head;
    while (curr.next != null) {
      if (curr.data == curr.next.data) curr.next = curr.next.next;
      else curr = curr.next;
    }
    return head;
  }

}