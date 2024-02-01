package Search_Algorithms.Binary_Search;

public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr={11,12,13,15,16,17,18,21,22}; 

        int target=21;

        int ans=search(arr , target);

        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ ans);
        }
    }

    private static int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid;
            }
            else if(arr[mid]<target){
                start=mid;
            }
        }
        return -1;
    }
}
