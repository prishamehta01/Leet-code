class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-min);
        }
        return maxProfit;
    }
}