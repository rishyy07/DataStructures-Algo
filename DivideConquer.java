import java.util.*;
//merge two sorted arrays
public class DivideConquer {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int arr1[] = { 2, 3, 4 };
        int arr2[] = { 1, 3, 5, 7, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n + m];
        int i = 0;
        int k = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
                k++;

            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }
        for (int a = 0; a < ans.length; a++) {
            System.out.print(ans[a] + " ");
        }

    }

}
//time complexity of this code is O(n+m)
//if done using arrays.sort and a new array , time complexity would be (n+m)log(n+m)