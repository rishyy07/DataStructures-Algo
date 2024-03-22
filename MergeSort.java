import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

        int arr[] = { 5, 8, 0, 1, 4, 2 };
        int low = 0;
        int high = arr.length - 1;
        mergesort(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergesort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int i = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i] = arr[left];
                left++;
                i++;
            } else {
                temp[i] = arr[right];
                right++;
                i++;
            }
        }
        while (left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }

        while (right <= high) {
            temp[i] = arr[right];
            right++;
            i++;
        }

        for (int j = low; j <= high; j++) {
            arr[j] = temp[j - low];
        }
    }
}
