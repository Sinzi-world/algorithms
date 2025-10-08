package solutions.two_pointers;

import java.util.Arrays;

public class Solution6 {

    public static void moveZeroes(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] == 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = (temp == 0) ? nums[left + 1] : Math.min(nums[left+1], temp);
            }
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

}
