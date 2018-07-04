package LongestPalindromicSubstring;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LongestPalindromicSubStringTest {
    @Test
    public void findAnagramMappingsTest() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        int answer = longestPalindromicSubstring.getLongestPalindromicSubstring("acbbca");
        assertEquals(6, answer);
    }

    @Test
    public void findAnagramMappingsTest1() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        int answer = longestPalindromicSubstring.getLongestPalindromicSubstring("abcdefghhgfedcba");
        assertEquals(16, answer);
    }

    @Test
    public void findAnagramMappingsTest2() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        int answer = longestPalindromicSubstring.getLongestPalindromicSubstring("abcdll");
        assertEquals(2, answer);
    }
}
