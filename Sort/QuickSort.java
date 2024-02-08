package Sort;

import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int low, int high) {
        if (low>=high) {
            return;
        }

        int start=low;
        int end=high;

        int mid=start+(end-start)/2;

        int pivot=arr[mid];

        while (start<=end) {
            while (pivot<arr[end]) {
                end--;
            }
            while (pivot>arr[start]) {
                start++;
            }

            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        
        sort(arr, low, end);
        sort(arr, start, high);
    }
    private static void swap(int[] arr, int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
