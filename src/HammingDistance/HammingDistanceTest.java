package HammingDistance;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HammingDistanceTest {

    @Test
    public void hammingDistanceTest1() {
        HammingDistance hammingDistanceObj = new HammingDistance();
        int hammingDistance = hammingDistanceObj.getHammingDistance(1,4);
        assertEquals(2, hammingDistance);
    }

    @Test
    public void hammingDistanceTest2() {
        HammingDistance hammingDistanceObj = new HammingDistance();
        int hammingDistance = hammingDistanceObj.getHammingDistance(16,15);
        assertEquals(5, hammingDistance);
    }
}
