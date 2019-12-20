public class Solution {
    public void setZeros(int[][] matrix) {
        boolean rowHasZero = false;
        boolean colHasZero = false;

        //check if first row has any zero
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                rowHasZero = true;
                break;
            }
        }

        //check if first column has any zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == true) {
                colHasZero = true;
                break;
            }
        }

        //check for zeros in the rest of the matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //set zeros on the col in matrix
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                nullifyCol(matrix, j);
            }
        }

        //set zeros on row in matrix
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0) {
                nullifyRow(matrix, i);
            }
        }

        if (rowHasZero) {
            nullifyRow(matrix, 0);
        }

        if (colHasZero) {
            nullifyCol(matrix, 0);
        }
    }

    public void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][i] = 0;
        }
    }

    public void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[j][col] = 0;
        }
    }
}
