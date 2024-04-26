package Round2;

// import java.util.Arrays;

public class Consecutive {
    
    public static void main(String[] args) {
        int[] arr={2,6,1,9,4,5,3};

        int ans=countconsective(arr);
        // sort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    private static int countconsective(int[] arr) {
        int count=1;
        sort(arr);
        int num=arr[0];
        int max=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==num+1) {
                count++;
                num=num+1;
            }
            else{
                num=arr[i];
            }
            if(count>max){
                max=count;
            }
        }
        count=max;
        return count;
    
    }
    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    
}
