package hackerrank.day30;

public class Day23_bst_level_order_traversal {
/*
  static void levelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>();
    List<Node> result = new ArrayList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node tempNode = queue.poll();
      result.add(tempNode);
      if (tempNode.left != null) queue.add(tempNode.left);
      if (tempNode.right != null) queue.add(tempNode.right);
    }
    String ans = result.stream()
            .mapToInt(n -> n.data)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));

  }
*/
}
