package CoinChangeMakingProblem;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CoinChangeMakingTest {

    @Test
    public void testCoinChangeMaking() {
        CoinChangeMaking ccm = new CoinChangeMaking();
        int[] denominations= {1,2,5};
        int minimumCoins = ccm.minimumCoinChangeMaking(denominations, 100);
        assertEquals(minimumCoins, 20);
    }
}
