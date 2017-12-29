package SelfDividingNumbers;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SelfDividingNumbersTest {
    @Test
    public void judgeRouteCircleTest1() {
        SelfDividingNumbers selfDividingNumbersObj = new SelfDividingNumbers();
        List<Integer> selfDividingNumbers = selfDividingNumbersObj.getSelfDividingNumbers(512,513);
        List<Integer> messages = Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22);
        assertEquals(messages, selfDividingNumbers);
    }
}
