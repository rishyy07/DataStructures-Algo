public class SlidingWindow1 {
    public static void main(String[] args) {

        // fixed sliding window
        int arr[] = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 4, 5 };
        int k = 3;
        System.out.println(maxsum(arr, k));
    }

    public static int maxsum(int arr[], int k) {
        // first calculate sum or product whatever you want to and ans var to store max
        // min value;
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        ans = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i]; // window grow
            sum -= arr[i - k]; // window shrink
            ans = Math.max(ans, sum);
        }
        return ans;
    }

}

// for sliding window variable see LC que 713 subarray product less than k and
// kartik bhaiya and strings