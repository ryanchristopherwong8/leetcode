package BuySellMaximizeProfit;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BuySellMaximizeProfitTEst {
    @Test
    public void test1() {
        BuySellMaximizeProfit buySellMaximizeProfit = new BuySellMaximizeProfit();
        int[] array = {100, 180, 260, 310, 40, 535, 695};
        int profit = buySellMaximizeProfit.getProfit(array);
        assertEquals(865, profit);
    }
}
