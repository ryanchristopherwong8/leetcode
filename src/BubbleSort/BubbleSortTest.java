package BubbleSort;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BubbleSortTest {

    @Test
    public void findAnagramMappingsTest() {
        BubbleSortImpl arrayPartition1 = new BubbleSortImpl();
        int[] array = {1,4,3,2};
        int[] sortedArray = {1,2,3,4};
        assertEquals(sortedArray, BubbleSortImpl.sort(array));
    }
}
