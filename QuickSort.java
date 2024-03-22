import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 7, 9, 3, 2, 8, 1, 0 };
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = fun(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static int fun(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i < j) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (j >= i && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        // swapping the pivot element

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }

}

// import java.util.*;

// public class QuickSort {
// public static void main(String[] args) {
// int arr[] = { 7, 9, 3, 2, 8, 1, 0 };
// int low = 0;
// int high = arr.length - 1;
// quicksort(arr, low, high);

// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void quicksort(int arr[], int low, int high) {
// if (low < high) {
// int pivot = fun(arr, low, high);
// quicksort(arr, low, pivot - 1);
// quicksort(arr, pivot + 1, high);
// }
// }

// public static int fun(int arr[], int low, int high) {
// int pivot = arr[low];
// int i = low + 1;
// int j = high;

// while (i <= j) {
// while (i <= j && arr[i] <= pivot) {
// i++;
// }
// while (j >= i && arr[j] > pivot) {
// j--;
// }

// if (i < j) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }

// // swapping the pivot element with the correct position
// int temp = arr[low];
// arr[low] = arr[j];
// arr[j] = temp;

// return j;
// }
// }
