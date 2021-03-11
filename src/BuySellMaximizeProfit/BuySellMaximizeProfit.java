package BuySellMaximizeProfit;

public class BuySellMaximizeProfit {
    public int getProfit(int[] prices) {
        // find local minimum
        // find local maximum
        // calculate profit
        // continue
        int totalDays = prices.length;
        int index = 0;
        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        while(index < totalDays - 1) { // [0....totalDays], condition only goes to second last element ie [0,1,2,3] i < 4-1
            while(index < totalDays - 1 && prices[index] > prices[index + 1]) { // keep searching for local minimum
                index++;
            }
            min = prices[index];
            while(index < totalDays - 1 && prices[index] < prices[index + 1]) { // keep searching for local maximum
                index++;
            }
            max = prices[index];
            profit += max - min;
        }
        return profit;
    }
}
