package Recursion.Sort_Algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,3,1,8,9};

        sort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr,int n) {
        if (n==1) {
            return;
        }
        for(int j=0;j<n-1;j++){
            if (arr[j]>arr[j+1]) {
                swap(arr,j,j+1);
            }
        }
        sort(arr, n-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
