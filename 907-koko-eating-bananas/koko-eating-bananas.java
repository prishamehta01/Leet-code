class Solution {
    public int getTotal(int[] piles,int k){
        //ceil value
        int totalHrs=0;
        for(int p:piles){
            totalHrs+=Math.ceil((double)p/k);
        }
        return totalHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int low=1,high=max;
        while(low<=high){
            int m = (low+high)/2;
            int totalHrs = getTotal(piles,m);
            if(totalHrs<=h){
                high = m-1;
            }
            else{
                low = m+1;
            }
        }
        return low;
    }
}