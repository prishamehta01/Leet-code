class Solution {
    public long timeTaken(int[] piles, int k){
        long total = 0;
        for(int bananas:piles){
            total+=bananas/k;
            if(bananas % k > 0){
                total+=1;
            }
        }
        return total;
    }

    public int getMax(int[] piles){
        int max = piles[0];
        for(int it:piles){
            if(it>max){
                max = it;
            }
        }
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int min = 1,max = getMax(piles),mid;
        while(min<=max){
            mid = (min+max)/2;
            long t = timeTaken(piles,mid);
            if(t<=h){
                max = mid - 1;
            }
            else{
                min = mid+1;
            }
        }
        return min;
    }
}