package MergeSort;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int[] array = {2,5,1};
        int[] sortedArray = {1,2,5};
        MergeSort.mergeSort(array, new int[array.length],0, array.length-1);
        assertEquals( Arrays.equals(sortedArray, array), true);
    }
}
