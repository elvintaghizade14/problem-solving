package hackerrank.problem_solving;

public class printElementsOfLinkedList {
  static class SinglyLinkedListNode {
    int value;
    SinglyLinkedListNode node;

    public SinglyLinkedListNode(int value) {
      this.value = value;
    }
  }

  static void printLinkedList(SinglyLinkedListNode head) {
    StringBuilder sb = new StringBuilder();
    while (head != null) {
      sb.append(head.value).append("\n");
      head = head.node;
    }
    System.out.println(sb.toString());
  }
}