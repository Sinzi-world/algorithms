package solutions;

import java.util.Arrays;

public class Solution1 {
    public boolean[] answerQueries(int[] nums, int[][] queries, int limit) {
        int n = nums.length;
        int m = queries.length;
        boolean[] res = new boolean[m];

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // обрабатываем запросы
        for (int i = 0; i < m; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int sum = prefix[y] - prefix[x] + nums[x];
            res[i] = sum < limit;
        }

        return res;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] nums = {1, 2, 3, 4, 5};
        int[][] queries = {{0, 2}, {2, 3}, {0, 4}};
        boolean[] res = solution1.answerQueries(nums, queries, 8);
        System.out.println(Arrays.toString(res));
    }
}
