package LongestCommonSubsequence;

import java.util.HashMap;

public class LongestCommonSubsequence
{

    public int longestCommonSubsequenceNaive(char[] x, char[] y, int m, int n) { // x[0...m]  y[0....n]
        // Time Complexity O(2^(n+m))   n+m equals height, nodes in tree
        // Space Complexity O(n+m) function stack
        // view as a tree by breaking into subproblems
        // base case:
        // 1) empty string return 0
        // 2) if both strings match return 1
        if (m < 0 || n < 0) {
            return 0;
        }
        if (x[m] == y[n]) {
            return 1 + longestCommonSubsequenceNaive(x, y, m-1, n-1);
        }
        return Math.max(longestCommonSubsequenceNaive(x,y,m-1,n), longestCommonSubsequenceNaive(x,y,m,n-1));
    }

    // replace recursive calls with look up
    // Time Complexity O(n + m)
    // Space Complexity O(n + m)
    public int longestCommonSubsequenceMemoization(char[] x, char[] y, int m, int n, HashMap<String, Integer> memo) { // x[0...m]  y[0....n]
        if (m < 0 || n < 0) {
            return 0;
        }
        String key = m + ":" + n;
        if (x[m] == y[n]) {
            memo.put(key, 1 + longestCommonSubsequenceNaive(x, y, m - 1, n - 1));
            return memo.get(key);
        }
        memo.put(key, Math.max(longestCommonSubsequenceNaive(x, y, m - 1, n), longestCommonSubsequenceNaive(x, y, m, n - 1)));
        return memo.get(key);
    }

    public int longestCommonSubsequenceTabulation(char[] x, char[] y, int m, int n) {
        // view problem as table
        // initialize table and seed known values
        // build from bottom up
        int[][] table = new int[m+1][n+1]; // string starts from index 1
        for(int i = 0; i <= m; i++) {
            for( int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) { // if compared with empty string equals 0
                    table[i][j] = 0;
                } else if (x[i-1] == y[j-1]) { // if there is a match, find answer to smaller subproblem i-1,j-1
                    table[i][j] = table[i-1][j-1] + 1;
                } else { // if no match, take max of two options
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        return table[m][n];
    }
}