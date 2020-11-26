package BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] arr) {
        // first take array and input buckets
        // sort buckets
        // read from buckets one by one
        int max = 0;
        int min = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        List[] buckets = new List[arr.length];
        for(int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList();
        }

        for(int i = 0; i < arr.length; i++) {
            buckets[hash(arr[i], max, arr.length)].add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for(int i = 0; i < buckets.length; i++) {
            for(int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = (int) buckets[i].get(j);
            }
        }
    }

    public static int hash(int i, int max, int numberOfBuckets) {
        return (int) ((double) i / max * (numberOfBuckets - 1));
    }
}
