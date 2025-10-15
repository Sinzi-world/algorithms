package solutions.prefix_sum;

public class Solution6 {
    public static int minStartValue(int[] nums) {
        int prefixSum = 0;
        int minPrefix = Integer.MAX_VALUE;

        for(int num: nums){
            prefixSum += num;
            minPrefix = Math.min(minPrefix, prefixSum);
        }

        return minPrefix >= 0 ? 1 : 1 - minPrefix;
    }

    public static int minStartValue1(int[] nums) {
        int minPrefix = Integer.MAX_VALUE;
        int[] prefix = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            prefix[i] = (i == 0) ? nums[0] : prefix[i - 1] + nums[i];
            minPrefix = Math.min(minPrefix, prefix[i]);
        }

        return minPrefix >= 0 ? 1 : 1 - minPrefix;
    }

    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        System.out.println(minStartValue(nums));
        System.out.println(minStartValue1(nums));
    }
}
