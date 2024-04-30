package Round2;

public class PrintMatrix {
    
    public static void main(String[] args) {
        int[][] arr={{5,6,15,16,25},
                     {4,7,14,17,24},
                     {3,8,13,18,23},
                     {2,9,12,19,22},
                     {1,10,11,20,21}};

       int[] index={0,0};

       int a=index[0];
       int b=index[1];

       if (a==0) {
        printDownwards(arr ,a ,b);
       }
       else{
        printUpwards(arr);
       }
    }

    private static void printDownwards(int[][] arr , int a ,int b)  {
        for (int i = a; i < arr.length; i++) {
            for (int j = b; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }

    private static void printUpwards(int[][] arr) {

    }
}
