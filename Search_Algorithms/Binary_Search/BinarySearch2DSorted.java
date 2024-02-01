package Search_Algorithms.Binary_Search;

public class BinarySearch2DSorted {

    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=4;

        int[] ans=search(arr,target);

        if(ans[0]==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at row number "+ans[0]+" and column number "+ans[1]);
        }
    }

    private static int[] search(int[][] arr, int target) {

        if(arr[0].length==0){
            return new int[]{-1,-1};
        }
        else if(arr.length==1){
            binarysearch(arr,0,0,arr[0].length-1,target);
        }

        int rstart=0;
        int rend=arr.length-1;
        int cmid=arr[0].length/2;

        while (rstart<=rend) {
            int mid=rstart+(rend-rstart)/2;
            if (arr[cmid][mid]==target) {
                return new int[]{cmid,mid};
            }
            else if(arr[cmid][mid]>target){
                rend=mid;
            }
            else{
                rstart=mid;
            }
        }

        if(arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        else if(arr[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }

        else if(arr[rstart][cmid-1]>=target){
            return binarysearch(arr,  rstart,0, cmid-1, target);
        }
        else if(arr[rstart][cmid+1]<=target && arr[rstart][arr[0].length-1]>=target){
            return binarysearch(arr,  rstart,cmid+1, arr[0].length-1, target);
        }
        else if(arr[rstart+1][cmid-1]>=target){
            return binarysearch(arr,  rstart+1,0, cmid-1, target);
        }
        else{
            return binarysearch(arr,  rstart+1,cmid+1, arr[0].length-1, target);
        }

    }

    private static int[] binarysearch(int[][] arr, int row, int cstart, int cend, int target) {
        while (cstart<=cend) {
            int mid=cstart+(cend-cstart)/2;
            if (arr[row][mid]==target) {
                return new int[]{row,mid};
            }
            else if(arr[row][mid]>target){
                cend=mid-1;
            }
            else{
                cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}