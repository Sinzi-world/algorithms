package solutions.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSorting(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSorting1(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {11, 7, 3, 9, 22, 15, 47, 1, 99};
        int[] arr1 = {11, 7, 3, 9, 22, 15, 47, 1, 99};
        insertionSorting(arr);
        System.out.println();
        insertionSorting1(arr1);
    }
}
