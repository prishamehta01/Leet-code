class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int min = Integer.MAX_VALUE;
        for(int x:prices){
            min = Math.min(min,x);
            maxPro = Math.max(maxPro, x-min);
        }
        return maxPro;
    }
}