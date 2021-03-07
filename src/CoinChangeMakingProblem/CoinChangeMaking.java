package CoinChangeMakingProblem;

public class CoinChangeMaking {

    public int minimumCoinChangeMaking(int[] denominations, int value) {
        // dynamic programming
        // view as a tree, there are many identical subproblems
        // create an array that stores the minimum number of coins based on on index as value (bottom up)
        // initialize array to have max values since we are looking for minimum
        int[] coins = new int[value + 1];
        for(int i = 1; i < coins.length; i++) {  // initialize all index are max integer except first element
            coins[i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i < coins.length; i++) {
            for(int j = 0; j < denominations.length; j++) {
                if (denominations[j] <= i) { // make sure coin is less than or equal to than value
                    int subproblemIndex = i - denominations[j]; // find subproblem index
                    if (subproblemIndex >= 0) {
                        coins[i] = Math.min(coins[subproblemIndex] + 1, coins[i]); // take minimum between current or previous subproblem
                    }
                }
            }
        }
        if(coins[value] == Integer.MAX_VALUE) {
            return 0;
        } else {
            return coins[value];
        }
    }
}
