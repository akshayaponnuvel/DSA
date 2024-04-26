package Round2;

public class Pivot {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};

        int ans = pivot(arr , 0 , 0);

        System.out.println(ans);
    }

    private static int pivot(int[] arr, int i, int pivotIndex) {
        if (i >= arr.length) {
            return pivotIndex;
        }

        int left = 0, right = 0;

        for (int j = 0; j < i; j++) {
            left += arr[j];
        }

        for (int j = i + 1; j < arr.length; j++) {
            right += arr[j];
        }

        if (left == right) {
            pivotIndex = i;
        }
        return pivot(arr, i + 1, pivotIndex);
    }
}
