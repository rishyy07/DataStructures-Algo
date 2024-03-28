import java.util.HashMap;

//this program calculates the length of longest subarray with at most k frequency

public class Leetcode2958 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3, 1, 2 };
        int k = 2;
        System.out.println(longestsubarray(arr, k));

    }

    public static int longestsubarray(int nums[], int k) {
        int ans = 0;
        int start = -1;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int end = 0; end < nums.length; end++) {
            freq.put(nums[end], freq.getOrDefault(nums[end], 0) + 1); // putting the values of array into map and
                                                                      // calculating frequency
            while (freq.get(nums[end]) > k) {
                start++;
                freq.put(nums[start], freq.get(nums[start]) - 1); // shrinking the window
            }
            ans = Math.max(ans, end - start); // for calculating longest subarray, growing the window
        }
        return ans;
    }
}
