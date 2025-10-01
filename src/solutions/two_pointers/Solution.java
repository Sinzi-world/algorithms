package solutions.two_pointers;

import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m, j = 0;
        while(j < n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int n = 3, m = 3;
        merge(nums1, n, nums2, m);
        int[] nums3 = {1, 2, 3, 0, 0, 0};
        int[] nums4 = {2, 5, 6};
        int n1 = 3, m2 = 3;
        merge1(nums3, n1, nums4, m2);
    }
}

