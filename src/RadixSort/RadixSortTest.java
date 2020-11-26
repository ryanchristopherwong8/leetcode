package RadixSort;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RadixSortTest {
    @Test
    public void radixSortTest() {
        int[] arr = {10, 0, 20, 100, 50, 90, 40, 50};
        int[] result = {0, 10, 20, 40, 50, 50, 90, 100};
        RadixSort.radixSort(arr);
        assertEquals(result, arr);
    }
}
