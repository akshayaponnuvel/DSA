package Round2;

import java.util.Arrays;

public class GreatestNearest {
    
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};

        replace(arr,0 );

        System.out.println(Arrays.toString(arr));
    }

    private static void replace(int[] arr, int  i) {
        if (i>=arr.length-1) {
            arr[arr.length-1]=-1;
            return;
        }

        int max=findMax(arr,i);
        arr[i]=max;

        replace(arr, i+1);
    }

    private static int findMax(int[] arr, int i) {
        int max=Integer.MIN_VALUE;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j]>max) {
                max=arr[j];
            }
        }
        return max;
    }
}
