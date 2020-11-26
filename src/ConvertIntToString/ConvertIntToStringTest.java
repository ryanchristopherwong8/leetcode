package ConvertIntToString;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ConvertIntToStringTest {

    @Test
    public void testConvertIntToString() {
        assertEquals("4", ConvertIntToString.convertIntToString(4));
        assertEquals("4", ConvertIntToString.convertIntToString(4));
    }

}
