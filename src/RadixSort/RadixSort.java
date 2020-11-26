package RadixSort;

public class RadixSort {
    public static void radixSort(int[] arr) {
        // find max of array
        int max = 0;
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        // call countSort iteratively based on 0 to most significant digits
        for(int exp = 1; max / exp > 0; exp *= 10) {
            countSortInPlace(arr, exp);
        }
    }

    public static void countSortInPlace(int[] arr, int exp) {
        // create startingPositionOfIndexedNumber based on base 10
        int[] startPositionOfIndexNumber = new int[10];
        // create sorted array based on size or input array
        int[] sortedArray = new int[arr.length];
        // count occurrences based on digit
        for(int num : arr) {
            startPositionOfIndexNumber[(num/exp) % 10]++;
        }
        // create cumulative array by adding previous to current
        for(int i = 1; i < startPositionOfIndexNumber.length; i++) {
            startPositionOfIndexNumber[i] = startPositionOfIndexNumber[i] + startPositionOfIndexNumber[i-1];
        }
        // shift cumulative array starting from end to get starting position of elements, initialize start to 0
        for(int i = startPositionOfIndexNumber.length - 1; i > 0; i--) {
            startPositionOfIndexNumber[i] = startPositionOfIndexNumber[i-1];
        }
        startPositionOfIndexNumber[0] = 0;
        // loop through input array and insert temp array based on starting position, increment starting position
        int indexNum;
        for(int num : arr) {
            indexNum = (num /exp) % 10;
            sortedArray[startPositionOfIndexNumber[indexNum]++] = num;
        }
        // copy array
        for(int i = 0; i < sortedArray.length; i++) {
            arr[i] = sortedArray[i];
        }
    }
}
