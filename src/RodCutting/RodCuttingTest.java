package RodCutting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RodCuttingTest {

    @Test
    public void test() {
        RodCutting rodCutting = new RodCutting();
        int[] lengths = {1,2,3,4,5,6,7,8};
        int[] prices = {1,5,8,9,10,17,17,20};
        int maxProfit = rodCutting.RodCutting(lengths, prices, 4);
        assertEquals(10, maxProfit);
    }

    /**
     * // int[] length = { 1, 2, 3, 4, 5, 6, 7, 8 };
     int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
     */
}
