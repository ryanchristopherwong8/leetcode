package InsertionSort;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InsertionSortTest {
    @Test
    public void test() {
        int[] input = {10, 2, 5, 3, 3, 9};
        int[] result = {2, 3, 3, 5, 9, 10};
        InsertionSort.insertionSort(input);
        assertEquals(input, result);
    }
}
