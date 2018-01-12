package NumberComplement;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NumberComplementTest {
    @Test
    public void judgeRouteCircleTest1() {
        NumberComplement numberComplementObj = new NumberComplement();
        int result = numberComplementObj.findComplement(5);
        assertEquals(2, result);
    }
}
