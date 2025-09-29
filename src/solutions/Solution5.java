package solutions;

public class Solution5 {
        public static int returnToBoundaryCount(int[] nums) {
            int way = 0;
            int count = 0;

            for(int i: nums){
                way += i;
                if(way == 0){
                    count++;
                }
            }
            return count;
        }

    public static int returnToBoundaryCount1(int[] nums) {
            int[] prefix = new int[nums.length];
            int count = 0;

            prefix[0] = nums[0];
            for (int i = 1; i < nums.length; i++){
                prefix[i] = prefix[i-1] + nums[i];
            }

            for(int i: prefix){
                if (i == 0){
                    count++;
                }
            }
            return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -5};
        System.out.println(returnToBoundaryCount(nums));
        System.out.println(returnToBoundaryCount1(nums));
    }
}
