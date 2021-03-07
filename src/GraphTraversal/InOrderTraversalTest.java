package GraphTraversal;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class InOrderTraversalTest {

    @Test
    public void findNumberOfOccurrencesInString() {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.printInOrder(inOrderTraversal.createGraph());
        ArrayList<Integer> obj = new ArrayList<Integer>(
                Arrays.asList(1,3,4,100,101,102));
        assertEquals(true, inOrderTraversal.result.equals(obj));
    }

    @Test
    public void buildBinaryTreeFromPreOrderAndInOrder() {
        int[] preOrder = {10, 3, 1, 4, 15};
        int[] inOrder = {1, 3, 4, 10, 15};
        ConstructBinaryTreeFromPreOrderTraversal constructBinaryTree = new ConstructBinaryTreeFromPreOrderTraversal();
        Node root = constructBinaryTree.buildTree(preOrder, inOrder);
        assertEquals(root.data==10, true);

    }
}
