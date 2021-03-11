package ShortestCommonSupersequence;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShortestCommonSupersequenceTest {
    @Test
    public void test2() {
        ShortestCommonSupersequence shortestCommonSupersequence = new ShortestCommonSupersequence();
        String test1 = "abac";
        String test2 = "cab";
        char[] test3 = test1.toCharArray();
        char[] test4 = test2.toCharArray();
        int scs = shortestCommonSupersequence.shortestCommonSupersequence(test3, test4, test3.length, test4.length);
        assertEquals(scs, 5);
    }
}
