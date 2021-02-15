package hackerrank.day30Java;

import java.util.HashSet;
import java.util.Set;

public class Day24_more_linked_lists {

  public static Node removeDuplicates(Node root) {
    Set<Integer> nodes = new HashSet<>();
    nodes.add(root.data);

    Node prevNode = root;
    Node currNode = root;
    while (currNode != null) {
      if (nodes.contains(currNode.data)) {
        prevNode.next = currNode.next;
        currNode = currNode.next;
      } else {
        prevNode = currNode;
        nodes.add(currNode.data);
        currNode = currNode.next;
      }
    }
    return root;
  }
}