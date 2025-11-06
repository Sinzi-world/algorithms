package solutions.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n = arr.length, comparisons = 0, swaps = 0;

        for (int i = n - 1; i > 0; i--){
            int maxIndex = i;
            for (int j = 0; j < i; j++){
                comparisons++;
                if(arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            if(maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                swaps++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(comparisons);
        System.out.println(swaps);
    }

    public static void main(String[] args) {
        int[] arr = {11, 7, 3, 9, 22, 15, 47, 1, 99};
        selectionSort(arr);
    }
}
