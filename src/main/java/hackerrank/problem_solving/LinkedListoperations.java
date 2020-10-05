package hackerrank.problem_solving;

public class LinkedListoperations {

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


}
