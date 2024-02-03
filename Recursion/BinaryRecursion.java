package Recursion;

public class BinaryRecursion {
    
    public static void main(String[] args) {
        int[] arr={11,12,13,14,15,16,17,18,19};

        int target=13;

        int ans=search(arr,target,0,arr.length-1);

        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ans);
        }
    }

    private static int search(int[] arr, int target,int start,int end) {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return search(arr,target,0,mid-1);
            }
            else if(arr[mid]<target){
                return search(arr,target,mid+1,arr.length-1);
            }
        }
        return -1;
    }
}
