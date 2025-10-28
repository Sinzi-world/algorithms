package solutions.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxLen = 0;

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int len = map.get(key) + map.get(key + 1);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static int findLHS1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res =0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.containsKey(num+1)){
                res = Math.max(res, map.get(num) + map.get(num+1));
            }
            if(map.containsKey(num-1)){
                res = Math.max(res, map.get(num) + map.get(num-1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
        System.out.println(findLHS1(nums));
    }
}