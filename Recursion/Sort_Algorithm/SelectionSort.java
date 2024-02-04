package Recursion.Sort_Algorithm;

import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int[] arr={2,3,4,1,5,6,8,7,9};
        sort(arr,0,arr.length-1);
        
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int last) {
        if(start>=last){
            return;
        }
        int maxindex=maxindex(arr,0,last);
        swap(arr,maxindex,last);
        sort(arr, start, last-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static int maxindex(int[] arr, int start, int last) {
        int maxindex=start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[maxindex]){
                maxindex=i;
            }
        }
        return maxindex;
    }
}
