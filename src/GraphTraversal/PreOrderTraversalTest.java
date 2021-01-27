package GraphTraversal;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PreOrderTraversalTest {

    @Test
    public void findNumberOfOccurrencesInString() {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.createGraph();
        Node node = preOrderTraversal.copyGraph(preOrderTraversal.root);
        assertEquals(node.data, preOrderTraversal.root.data);
    }
}
