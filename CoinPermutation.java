public class CoinPermutation {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int n = 8;
        coin(arr, n, "");
    }

    public static void coin(int arr[], int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (n >= arr[i]) {
                coin(arr, n - arr[i], ans + arr[i] + " ");

            }
        }
    }

}
