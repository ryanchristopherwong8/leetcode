package InsertionSort;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        //for each element in array
            // check if compare to sorted sub array
        for(int i = 0; i < arr.length; i++) {
            int currentIndex = i;
            while(currentIndex - 1 >= 0 && arr[currentIndex] < arr[currentIndex - 1]) {
                int temp = arr[currentIndex - 1];
                arr[currentIndex - 1] = arr[currentIndex];
                arr[currentIndex] = temp;
                currentIndex--;
            }
        }
    }
}
