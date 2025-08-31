class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int beg = 0,end=x/2,ans=0;
        while(beg<=end){
            int mid = beg + (end-beg)/2;
            long sq = (long)mid*mid;
            if(sq==x){
                return mid;
            }else if(sq<x){
                ans = mid;
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}