package solutions.prefix_sum;

public class Solution7 {
    public static int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++) prefix[i] = prefix[i-1] + nums[i];

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        for(int i = 0; i < n; i++){
            leftSum[i] = (i == 0) ? 0 : prefix[i-1];
            rightSum[i] = (i == n-1) ? 0 : prefix[n-1] - prefix[i];
            if(leftSum[i] == rightSum[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));

    }
}