package Search_Algorithms;

public class BinarySearch2D {
    
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        int target=8;

        int[] ans=search(arr,target);

        if(ans[0]==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at row number "+ans[0]+" and col number "+ans[1]);
        }
         
    }

    private static int[] search(int[][] arr, int target) {
        int row=0;
        int col=arr[row].length-1;

        while (row<arr.length && col>=0) {
            if (arr[row][col]==target) {
                return new int[]{row,col};
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }

        return new int[]{-1,-1};
    }
}
