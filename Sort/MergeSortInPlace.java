package Sort;

import java.util.Arrays;

public class MergeSortInPlace {
    
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};

        sort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int end) {
        if(end-start==1){
            return;
        }
        int mid=(start+end)/2;

        sort(arr, start, mid);
        sort(arr, mid, end);

        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i=start;
        int j=mid;
        int k=0;

        int[] ans=new int[end-start];

        while (i<mid && j<end) {
            if (arr[i]<arr[j]) {
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<mid) {
            ans[k]=arr[i];
            i++;
            k++;
        }
        while (j<end) {
            ans[k]=arr[j];
            j++;
            k++;
        }
        
        for(int s=0;s<ans.length;s++){
            arr[start+s]=ans[s];
        }
    }
}
