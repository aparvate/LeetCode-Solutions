class Solution {
    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int returnI = 0;
        int returnValue = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < least){
                least = prices[i];
            }
            returnI = prices[i] - least;
            if (returnValue < returnI){
                returnValue = returnI;
            }
        }
        return returnValue;
    }
}