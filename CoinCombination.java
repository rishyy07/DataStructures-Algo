public class CoinCombination {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, };
        int target = 8;
        coin(arr, target, "", 0);

    }

    public static void coin(int arr[], int target, String ans, int idx) {
        if (target == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (target >= arr[i]) {
                coin(arr, target - arr[i], ans + arr[i], i);
            }
        }
    }

}
