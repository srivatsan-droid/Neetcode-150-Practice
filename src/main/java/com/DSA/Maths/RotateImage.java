package com.DSA.Maths;

public class RotateImage {
    public static void rotate(int[][] matrix) {

        // Step 1: Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < matrix.length; i++) {

            int left = 0;
            int right = matrix[i].length - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for(int i = 0;i < matrix.length;i++) {
            for(int j = 0;j < matrix[0].length;j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
    }
    public  static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        printMatrix(matrix);
    }
}
