package solutions.sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int len = Math.abs(i - map.get(nums[i]));
                if(len <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(window.contains(nums[i])) return true;
            window.add(nums[i]);
            if(window.size() > k){
                window.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
        System.out.println(containsNearbyDuplicate1(nums, k));
    }
}