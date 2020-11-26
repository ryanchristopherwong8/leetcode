package BucketSort;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BucketSortTest {

    @Test
    public void testBucketSort() {
        int [] input = {4,2,1,10,3};
        int[] result = {1,2,3,4,10};
        BucketSort.bucketSort(input);
        assertEquals(result, input);
    }
}
