package Recursion.Arrays;

public class SortedOrNot {
    
    public static void main(String[] args) {
        int[] arr={1,3,4,12,23,34};

        boolean ans=sorted(arr);
        System.out.println(ans);
        boolean ans1=sorted(arr,0);
        System.out.println(ans1);
    }

    // using recursion
    private static boolean sorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }

    // iterative method
    private static boolean sorted(int[] arr) {
        boolean ans=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                ans=true;
            }
        }
        return ans;
    }
}
