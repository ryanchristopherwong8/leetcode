package ThreeSum;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ThreeSumTest {
    @Test
    public void threeSumTest() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
        List<Integer> sample1 = new ArrayList<>();
        sample1.add(-1);
        sample1.add(0);
        sample1.add(1);
        List<Integer> sample2 = new ArrayList<>();
        sample2.add(-1);
        sample2.add(-1);
        sample2.add(2);
        List<List<Integer>> correctResult = new ArrayList<>();
        correctResult.add(sample2);
        correctResult.add(sample1);

        assertEquals(correctResult, result);
    }
}
