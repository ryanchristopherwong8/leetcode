package MergeSort;

public class MergeSort {
    public static void mergeSort(int[] array, int [] tempArray, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (rightEnd + leftStart) / 2;
        mergeSort(array, tempArray, leftStart, middle);
        mergeSort(array, tempArray,middle + 1, rightEnd);
        mergeHalves(array, tempArray, leftStart, rightEnd);
    }
    public static void mergeHalves(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        // copy remaining left elements
        System.arraycopy(array, left, tempArray, index, leftEnd - left + 1);
        // copy remaining right elements
        System.arraycopy(array, right, tempArray, index, rightEnd - right + 1);
        // copy temp array into array
        System.arraycopy(tempArray, leftStart, array, leftStart, size);
    }
}
