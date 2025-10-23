package solutions.prefix_sum_medium;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0, count =0;

        for(int num: nums){
            prefix += num;
            if(map.containsKey(prefix-k)) count += map.get(prefix-k);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
