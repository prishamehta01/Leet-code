class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int x:prices){
            if(x<min){
                min = x;
            }
            profit = Math.max(profit,x-min);
        }
        return profit;
    }
}