package solutions.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSorting(int[] arr){
        int n = arr.length;
        boolean swapped;
        int comparisons = 0;
        int swaps = 0;

        for(int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swaps++;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(comparisons);
        System.out.println(swaps);
    }

    public static void main(String[] args) {
        int[] arr = {11, 7, 3, 9, 22, 15, 47, 1, 99};
        bubbleSorting(arr);
    }
}
