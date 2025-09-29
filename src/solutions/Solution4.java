package solutions;


public class Solution4 {
    public static int largestAltitude(int[] gain) {
        int[] heights = new int[gain.length];

        heights[0] = gain[0];
        for (int i = 1; i < gain.length; i++){
            heights[i] = heights[i-1] + gain[i];
        }

        int max = 0;
        for (int highest: heights){
            if(highest > max){
                max = highest;
            }
        }

        return max;
    }

    public static int largestAltitude1(int[] gain) {
        int start = 0;
        int ans = 0;

        for(int high: gain){
            start += high;
            ans = Math.max(ans, start);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
        System.out.println(largestAltitude1(gain));
    }
}
