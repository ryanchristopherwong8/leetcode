package GraphTraversal;

import java.util.ArrayList;

public class InOrderTraversal{
    ArrayList<Integer> result = new ArrayList<>();
    public Node createGraph() {
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(4, null, null);
        Node node3 = new Node(3, node1, node2);
        Node node5 = new Node(102, null, null);
        Node node6 = new Node(101, null, node5);
        Node root = new Node(100, node3, node6);
        return root;
    }

    public void printInOrder(Node root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        result.add(root.data);
        printInOrder(root.right);
    }
}
