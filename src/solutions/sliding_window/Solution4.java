package solutions.sliding_window;

import java.util.Arrays;

public class Solution4 {
    public static int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i + k - 1 < n; i++){
            int diff = nums[i+k-1] - nums[i];
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        System.out.println(minimumDifference(nums, k));
    }
}