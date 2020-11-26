package QuickSort;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void test() {
        int[] arr = {1,6,2,3,7,10};
        int[] response = {1,2,3,6,7,10};
        QuickSort.quickSort(arr, 0, arr.length-1);
        assertEquals(arr, response);
    }
}
