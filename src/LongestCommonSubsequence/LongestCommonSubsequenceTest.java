package LongestCommonSubsequence;

import org.testng.annotations.Test;

import java.util.HashMap;

public class LongestCommonSubsequenceTest {

    @Test
    public void testRecursive() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                lcs.longestCommonSubsequenceNaive( X, Y, m-1, n-1 ) );
    }

    @Test
    public void testMemoization() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        HashMap<String, Integer> map = new HashMap<>();


        System.out.println("Length of LCS is" + " " +
                lcs.longestCommonSubsequenceMemoization( X, Y, m-1, n-1, map) );
    }


    @Test
    public void testTabulation() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;

        System.out.println("Length of LCS is" + " " +
                lcs.longestCommonSubsequenceTabulation( X, Y, m, n) );
    }
}
