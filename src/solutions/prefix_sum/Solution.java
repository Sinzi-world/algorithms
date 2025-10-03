package solutions.prefix_sum;

public class Solution {
    public static int subarraySum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int total = 0;

        for(int i = 0; i < nums.length; i++){
            int start = Math.max(0, i - nums[i]);
            int sum = prefix[i] - (start > 0 ? prefix[start-1] : 0);
            total += sum;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        System.out.println(subarraySum(nums));
    }
}
