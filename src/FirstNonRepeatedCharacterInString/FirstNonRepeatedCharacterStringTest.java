package FirstNonRepeatedCharacterInString;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstNonRepeatedCharacterStringTest {
    @Test
    public void findNumberOfOccurrencesInString() {
        assertEquals("o", FirstNonRepeatedCharacterString.firstNonRepeatedCharacterString("helloeh"));
        assertEquals("t", FirstNonRepeatedCharacterString.firstNonRepeatedCharacterString("bbbthebuilder"));
    }
}
