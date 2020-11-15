package BubbleSort;

public class BubbleSortImpl {

    // loop through each element
        // compare each element to the next elemnt
        // if greater than the right most element, swap element
        // if not greater than

    public static int[] sort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
