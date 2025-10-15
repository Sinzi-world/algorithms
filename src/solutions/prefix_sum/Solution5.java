package solutions.prefix_sum;

public class Solution5 {
    public static int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int total = -1;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            leftSum[i] = (i == 0) ? 0 : prefix[i - 1];
            rightSum[i] = (i == nums.length - 1) ? 0 : prefix[nums.length-1] - prefix[i];
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return total;
    }

    public static int pivotIndex1(int[] nums){
        int totalSum = 0;
        for(int num: nums){
            totalSum += num;
        }

        int leftTotal = 0;
        for(int i = 0; i < nums.length; i++){
            int rightTotal = totalSum - leftTotal - nums[i];
            if (rightTotal == leftTotal){
                return i;
            }
            leftTotal += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
        System.out.println(pivotIndex1(nums));
    }
}
