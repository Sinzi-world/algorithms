package solutions.two_pointers;

public class Solution7 {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i += 2*k){
            int j = Math.min(i + k - 1 , arr.length - 1);
            reverse(arr , i , j);
        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}