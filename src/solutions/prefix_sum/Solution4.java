package solutions.prefix_sum;

public class Solution4 {
    public static int pivotInteger(int n) {
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i] = i+1;
        }

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < n; i++){
            if(prefix[i] == (prefix[n-1] - prefix[i] + arr[i])) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(pivotInteger(n));
    }
}