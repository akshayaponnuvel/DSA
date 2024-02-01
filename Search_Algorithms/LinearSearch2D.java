package Search_Algorithms;

public class LinearSearch2D {

    public static void main(String[] args) {
        int[][] arr={
            {1,3,4},
            {12,43,23},
            {41,55,14}
        };

        int target=23;

        int[] ans=search(arr , target);

        if(ans[0]==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at row number "+ ans[0] +" column number "+ ans[1]);
        }
    }

    private static int[] search(int[][] arr, int target) {
        int[] ans =new int[2];
        if(arr.length==0){
            ans[0]=-1;
            return ans;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        ans[0]=-1;
        return ans;
    }
}