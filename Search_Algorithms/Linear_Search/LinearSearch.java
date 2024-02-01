package Search_Algorithms.Linear_Search;


public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={7,18,29,41,52,63,74};
        int target=29;

        int ans=Search(arr , target);

        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ ans);
        }
    }

    private static int Search(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
        }
        return-1;
    }
}