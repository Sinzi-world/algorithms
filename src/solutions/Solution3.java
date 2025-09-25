package solutions;

public class Solution3 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - i;
            int totalSubarrays = left * right;
            int oddCount = (totalSubarrays + 1) / 2;
            total += arr[i] * oddCount;
        }

        return total;
    }

    public static int sumOddLengthSubarrays1(int[] arr) {
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int total = 0;


        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j += 2) {

                int subSum = prefix[j] - prefix[i] + arr[i];
                total += subSum;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}

