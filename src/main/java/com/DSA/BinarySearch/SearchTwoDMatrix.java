package com.DSA.BinarySearch;

public class SearchTwoDMatrix {
    public static boolean searchBrute(int matrix[][],int target) {
        int col = matrix[0].length;
        for(int i = 0;i < matrix.length;i++) {
            for(int j = 0;j < col;j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean searchOptimized(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean ans = searchOptimized(matrix,target);
        System.out.println(ans);
    }
}
