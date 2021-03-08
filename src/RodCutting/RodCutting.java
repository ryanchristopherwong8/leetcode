package RodCutting;

public class RodCutting {
    public int RodCutting(int[] lengths, int[] prices, int amount) {
        // Time Complexity O(length of requested rod * number of rods to choose from)
        // Space Complexity O(length of requested rod)

        // we can see overlapping smaller problems
        // use tabulation, single array that stores profit in relation to length of rod (index)
        // initialize array to store all negative values except for length 0 which is equal to 0
        // fill in array using bottom up approach, loop through profit array and loop through each rod
        // if rod is equal to than or less than current length, compare current profit with subproblem profit

        int[] profit = new int[amount + 1];
        for(int i = 0; i < profit.length; i++) {
            profit[i] = -1;
        }
        profit[0] = 0;
        for(int i = 1; i < profit.length; i++) {
            for(int j = 0; j < lengths.length; j++) {
                int length = lengths[j];
                if (length <= i) {  // if the length of the rod is smaller or equal to than index
                    int price = prices[j];
                    profit[i] = Math.max(profit[i], profit[i-length] + price); // max of current and subproblem + price
                }
            }
        }
        return profit[amount];
    }
}
