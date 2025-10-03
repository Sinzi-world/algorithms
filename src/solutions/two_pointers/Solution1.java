package solutions.two_pointers;

import java.util.Arrays;

public class Solution1 {
    public static int[] sortedSquares(int[] nums) {
        int[] sortedSqrs = new int[nums.length];
        int left = 0, right = nums.length - 1, curr = right;
        while(curr >= 0){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                sortedSqrs[curr] = nums[left] * nums[left];
                left++;
            } else{
                sortedSqrs[curr] = nums[right] * nums[right];
                right--;
            }
            curr--;
        }
        return sortedSqrs;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}