package solutions.two_pointers_medium;

public class Solution2 {
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxArea = Integer.MIN_VALUE;

        while(left<right){
            int area = (right-left) * Math.min(height[left], height[right]);

            if(height[left] <= height[right]){
                left++;
            } else{
                right--;
            }
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
