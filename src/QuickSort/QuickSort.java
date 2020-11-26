package QuickSort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int sortedPosition = partition(arr, low, high);
                quickSort(arr, low, sortedPosition - 1);
                quickSort(arr, sortedPosition + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                // swap arr[i] and arr[j]
                int temp = arr[low];
                arr[low] = arr[j];
                arr[j] = temp;
                low++;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        return low;
    }
}
