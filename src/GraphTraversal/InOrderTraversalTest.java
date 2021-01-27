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
}
