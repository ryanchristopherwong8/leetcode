package GraphTraversal;

public class PreOrderTraversal {

    Node root;

    public Node createGraph() {
        Node node1 = new Node(1, null, null);
        Node node2 = new Node(4, null, null);
        Node node3 = new Node(3, node1, node2);
        Node node5 = new Node(102, null, null);
        Node node6 = new Node(101, null, node5);
        root = new Node(100, node3, node6);
        return root;
    }

    public Node copyGraph(Node oldNode) {
        if(oldNode == null) {
            return null;
        }
        Node newNode = new Node(oldNode.data);
        newNode.left = copyGraph(oldNode.left);
        newNode.right = copyGraph(oldNode.right);
        return newNode;
    }
}
