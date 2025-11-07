package solutions.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSortingAsc(int[] arr) {
        int n = arr.length, comparisons = 0, swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minElIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minElIdx]) {
                    minElIdx = j;

                }
            }
            if (minElIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minElIdx];
                arr[minElIdx] = temp;
                swaps++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(comparisons);
        System.out.println(swaps);
    }

    public static void selectionSortingDesc(int[] arr){
        int n = arr.length, comparisons = 0, swaps = 0;

        for(int i = n - 1; i > 0; i--){
            int maxElIdx = i;
            for(int j = 0; j < i; j++){
                comparisons++;
                if (arr[j] > arr[maxElIdx]) {
                    maxElIdx = j;
                }
            }
            if (maxElIdx != i) {
                int temp = arr[i];
                arr[i] = arr[maxElIdx];
                arr[maxElIdx] = temp;
                swaps++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(comparisons);
        System.out.println(swaps);
    }


    public static void main(String[] args) {
        int[] arr = {11, 7, 3, 9, 22, 15, 47, 1, 99};
        int[] arr1 = {11, 7, 3, 9, 22, 15, 47, 1, 99};
        selectionSortingAsc(arr);
        System.out.println();
        selectionSortingDesc(arr1);
    }
}
