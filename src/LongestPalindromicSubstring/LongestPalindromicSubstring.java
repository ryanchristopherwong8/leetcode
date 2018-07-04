package LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

    public boolean[][] solutionMap;
    public int getLongestPalindromicSubstring(String string) {
        int length = string.length();
        int max = 1;
        solutionMap = new boolean[length][length];

        for(int i = 0; i < length; i++) {
            solutionMap[i][i] = true;

        }

        for(int i = 0; i <length -1; i++) {
            if(string.charAt(i) == string.charAt(i + 1)) {
                solutionMap[i][i+1] = true;
                max = 2;
            }
        }

        for(int k = 3; k <= length; k++) {
            for(int i = 0; i < length - k + 1; i++) {
                int j = i + k - 1;
                if(solutionMap[i+1][j-1] == true) {
                    if(string.charAt(i) == string.charAt(j)) {
                        solutionMap[i][j] = true;
                        if(k > max) {
                            max = k;
                        }
                    }
                }
            }
        }

        return max;
    }
}
