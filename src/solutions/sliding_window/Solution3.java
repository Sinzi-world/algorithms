package solutions.sliding_window;

import java.util.Arrays;

public class Solution3 {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if(k == 0) return res;

        int sum = 0, left = 0;
        for(int right = 0; right < n + Math.abs(k); right++){
            sum += code[right % n];

            if(right - left + 1 > Math.abs(k)){
                sum -= code[left % n];
                left = (left + 1) % n;
            }
            if(right - left + 1 == Math.abs(k)){
                if(k > 0){
                    res[(left - 1 + n) % n] = sum;
                } else{
                    res[(right + 1) % n] = sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int k = 3;
        System.out.println(Arrays.toString(decrypt(code, k)));
    }
}