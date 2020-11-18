package CountNumberOfOccurrencesInString;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CountNumberOfOccurrencesInStringTest {
    @Test
    public void findNumberOfOccurrencesInString() {
        assertEquals(3, CountNumberOfOccurrencesInString.countNumberOfOccurrencesInString("Hello world, how many a are in this sentence A?", 'a'));
        assertEquals(3, CountNumberOfOccurrencesInString.countChars("Hello world, how many a are in this sentence A?", 'a'));
    }
}
