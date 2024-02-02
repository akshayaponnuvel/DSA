package Sort;

import java.util.Arrays;

// Time complexity O(n)
// Space complexity O(1)

public class CyclicSort {

    public static void main(String[] args) {
        
        int[] arr={7,5,6,3,4,2,1}; 

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i=0;
        while (i<arr.length) {
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}