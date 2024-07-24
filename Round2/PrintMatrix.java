package Round2;

import java.util.Arrays;

public class PrintMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 6, 15, 16, 25},
                {4, 7, 14, 17, 24},
                {3, 8, 13, 18, 23},
                {2, 9, 12, 19, 22},
                {1, 10, 11, 20, 21}
        };

        int[] nums = new int[5 * 5];
        int row = 4;
        int col = 0;
        int rowStart = 0, rowEnd = arr.length;
        int colStart = 0, colEnd = arr[0].length;
        int count = 0;

        while (count < 5 * 5) {
            if (row != 0) {
                for (int i = row; i >= 0; i--) {
                    nums[count++] = arr[i][col % colEnd];
                }
                col = (col + 1) % colEnd;
                if (count < 5 * 5) {
                    for (int i = rowStart; i <= row; i++) {
                        nums[count++] = arr[i][col % colEnd];
                    }
                    col = (col + 1) % colEnd;
                }
            } else {
                for (int i = row; i < arr.length; i++) {
                    nums[count++] = arr[i][col % colEnd];
                }
                col = (col + 1) % colEnd;
                if (count < 5 * 5) {
                    for (int i = colEnd - 1; i >= 0; i--) {
                        nums[count++] = arr[i][col % colEnd];
                    }
                    col = (col + 1) % colEnd;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}