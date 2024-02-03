package Recursion.Search_algorithm;

public class LinearSearch {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=3;

        int ans=search(arr,target,0,arr.length-1);

        if(ans==-1){
            System.out.println("Element not Found");
        }
        else{
            System.out.println("Element found at index "+ans);
        }
    }

    private static int search(int[] arr, int target,int start,int end) {
        if(start>end){
            return -1;
        }
        if(arr[start]==target){
            return start;
        }
        return search(arr, target, start+1, end);
    }
}
