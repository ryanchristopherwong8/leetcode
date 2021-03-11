package ShortestCommonSupersequence;

public class ShortestCommonSupersequence {

    public int shortestCommonSupersequence(char[] x, char[] y, int m, int n) { // x[0..m-1  y[0..n-1]
        int[][] matrix = new int[m+1][n+1];
        // visualize as table
        // bottom up approach
        // initialize and seed known values
        // fill first row with appending column string
        // fill first column with appending row string
        // if there is a match, read from matrix[i-1][j-1] and add one
        // if there is no match, pick minimum of matrix[i][j-1] + 1 OR matrix[i-1][j] + 1
        for(int i = 0; i <= n; i++) {
            matrix[0][i] = i;
        }
        for(int j = 0; j <= m; j++) {
            matrix [j][0] = j;
        }
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(x[i-1] == y[j-1]) {
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                } else {
                    matrix[i][j] = Math.min(matrix[i][j-1] + 1, matrix[i-1][j] + 1);
                }
            }
        }
        return matrix[m][n];
    }
}
