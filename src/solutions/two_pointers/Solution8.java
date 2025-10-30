package solutions.two_pointers;

import java.util.Arrays;

public class Solution8 {
    public static int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }

    public static int[] sortArrayByParity1(int[] nums) {
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
        System.out.println(Arrays.toString(sortArrayByParity1(nums)));
    }
}
