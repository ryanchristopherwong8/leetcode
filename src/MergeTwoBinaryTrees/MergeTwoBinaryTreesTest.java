package MergeTwoBinaryTrees;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class MergeTwoBinaryTreesTest {
    @Test
    public void mergeTwoBinaryTreesTest1() {
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        TreeNode nodeA = new TreeNode(1);
        nodeA.left = new TreeNode(3);
        nodeA.right = new TreeNode(2);
        nodeA.left.left = new TreeNode(5);
        nodeA.left.left.left = new TreeNode(100);
        TreeNode nodeB = new TreeNode(2);
        nodeB.left = new TreeNode(1);
        nodeB.right = new TreeNode(3);
        nodeB.left.right = new TreeNode(4);
        nodeB.right.right = new TreeNode(7);

        TreeNode treeNode =  mergeTwoBinaryTrees.mergeTrees(nodeA,nodeB);
        assertEquals(7, treeNode.right.right.val);
        assertEquals(4, treeNode.left.val);
        assertEquals(5, treeNode.right.val);
    }
}
