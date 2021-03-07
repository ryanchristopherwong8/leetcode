package GraphTraversal;

import java.util.concurrent.atomic.AtomicInteger;

public class ConstructBinaryTreeFromPreOrderTraversal {
    // input: preOrder and inOrder traversal
    // pre order: root left right
    // in order: left root right
    // we can build binary tree from top down which implies preOrder

    // for each element in pre order, find index in inOrder
    // inOrder index, gives us the boundaries of where to call left or right
    // buildTree(int preStart, int preEnd, inStart, inEnd)
    // ex. buildTree(0, preArray.length, 0, inArray.length)

    public Node buildTree(int[] preOrder, int[] inOrder) {
        Node root = helper(preOrder, new AtomicInteger(0), inOrder, 0,inOrder.length-1);
        return root;
    }

    public Node helper(int[] preOrder, AtomicInteger preOrderStart, int[] inOrder, int inOrderStart, int inOrderEnd) {
        if (inOrderStart > inOrderEnd) {
            return null;
        }
        Node node = new Node(preOrder[preOrderStart.getAndIncrement()]);
        int index = 0;
        for(int i = inOrderStart; i <= inOrderEnd; i++) {
            if(node.data == inOrder[i]) {
                index = i;
            }
        }

        node.left = helper(preOrder, preOrderStart, inOrder, inOrderStart, index - 1);
        node.right = helper(preOrder, preOrderStart, inOrder, index + 1, inOrderEnd);
        return node;
    }
}
