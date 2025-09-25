package solutions;

import java.util.Arrays;

public class Solution2 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++){
            prefix[i] = prefix[i -1] + nums[i];
        }

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i = 0; i < n; i++) {
            leftSum[i] = (i == 0) ? 0 : prefix[i-1];
            rightSum[i] = (i == n-1) ? 0 : prefix[n-1] - prefix[i];
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
