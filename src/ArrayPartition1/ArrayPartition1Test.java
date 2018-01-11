package ArrayPartition1;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayPartition1Test {

    @Test
    public void findAnagramMappingsTest() {
        ArrayPartition1 arrayPartition1 = new ArrayPartition1();
        int[] A = {1,4,3,2};
        assertEquals(4, arrayPartition1.arrayPairSum(A));
    }
}
