package CountingSort;

public class CountingSort {

    public static void countingSort(int [] arr) {
        // discover them max
        int max = 0;
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        // include 0 in array, max + 1
        int[] countArray = new int[max + 1];
        // increment elements in countArray by relating arr[i] with index of countArray
        for(int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        // fill in arr based on countArray occurrences
        int index = 0;
        for(int i = 0; i < countArray.length; i++) {
            int occurrences = countArray[i];
            for(int j = 0; j  < occurrences; j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    public static int[] countingSortInPlace(int[] arr) {
        // find the max
        int max = 0;
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        // create startPositionOfIndexedNumber array according to max
        int[] startingPositionOfIndexedNumber = new int[max + 1];
        for(int i = 0; i < arr.length; i++) {
            startingPositionOfIndexedNumber[arr[i]]++;
        }
        // add the previous element to current element to convert = cumulative array (there are a total of this many elements ending with index)
        for(int i = 1; i < startingPositionOfIndexedNumber.length; i++) {
            startingPositionOfIndexedNumber[i] = startingPositionOfIndexedNumber[i] + startingPositionOfIndexedNumber[i-1];
        }
        // shift elements starting from end of array = start of position of each indexed number, set first number to 0
        for(int i = startingPositionOfIndexedNumber.length - 1; i > 0; i--) {
            startingPositionOfIndexedNumber[i] = startingPositionOfIndexedNumber[i-1];
        }
        startingPositionOfIndexedNumber[0] = 0;
        // loop through original array and find start position to insert into sorted array, increment startingPositionOfIndexedNumber
        int[] sortedArray = new int[arr.length];
        for(int num : arr) {
            sortedArray[startingPositionOfIndexedNumber[num]++] = num;
        }
        return sortedArray;
    }
}
