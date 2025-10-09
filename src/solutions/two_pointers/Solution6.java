package solutions.two_pointers;

import java.util.Arrays;

public class Solution6 {

    public static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 2, 4, 0, 10};
        moveZeroes(nums);
    }

}
