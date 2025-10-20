package solutions.two_pointers_medium;

import java.util.Arrays;

public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[n-1];

        for(int i = 0; i < n - 2; i++){
            int left = i+1, right = n-1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                if(sum < target) left++;
                if(sum > target) right--;
                if(sum==target) return target;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}