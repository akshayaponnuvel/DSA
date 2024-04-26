package Round2;

public class Interval{

    public static void main(String[] args){

        int[][] arr={
            {0,30},
            {5,10},
            {5,20}
        };
        int[][] arr1={
            {2,4},
            {7,10}};

        boolean ans=checkintervals(arr1);
        boolean ans1=checkintervals(arr);
        System.out.println(ans);
        System.out.println(ans1);
    }

    public static boolean checkintervals(int[][] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j][0]>arr[j+1][0]) {
                    swap(arr,j,j+1);
                }
            }
        }
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i][1]>arr[i+1][0]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = temp;
    }
}

