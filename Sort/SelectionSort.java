package Sort;

import java.util.Arrays;

public class SelectionSort {
    
    // Time complexity is O(N^2)
    // Space complexity is O(1)
    public static void main(String[] argrs){
        int[] arr={5,3,4,2,1};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=max(arr,0,last);

            swap(arr, maxindex, last);
        }
    }

    private static int max(int[] arr, int i, int last) {
        int max=i;
        for(i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
