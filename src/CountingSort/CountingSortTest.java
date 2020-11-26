package CountingSort;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;


public class CountingSortTest {
    @Test
        public void testCountingSort() {
        int[] arr = {10, 0, 20, 100, 50, 90, 40, 50};
        int[] result = {0, 10, 20, 40, 50, 50, 90, 100};
        CountingSort.countingSort(arr);
        assertEquals(result, arr);
    }

    @Test
    public void testCountingSortInPlace() {
        int[] arr = {10, 0, 20, 100, 50, 90, 40, 50, 33};
        int[] result = {0, 10, 20, 33, 40, 50, 50, 90, 100};
        assertEquals(result, CountingSort.countingSortInPlace(arr));
    }
}
