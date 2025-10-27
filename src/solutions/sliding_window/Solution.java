package solutions.sliding_window;

public class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        double res = prefix[k-1] * 1.0 / k;
        for(int i = k; i < prefix.length; i++){
            res = Math.max(res, (prefix[i] - prefix[i-k]) * 1.0 / k);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
