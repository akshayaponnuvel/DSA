package Sort;

import java.util.Arrays;

// Space complexity O(1)
// Time complexity O(N^2) 

public class InsertionSort {
    
    public static void main(String[] args) {
        int[] arr={9,5,6,4,3,2,7,8,1};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
       for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }
                else{
                    break;
                }
            }
       }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
