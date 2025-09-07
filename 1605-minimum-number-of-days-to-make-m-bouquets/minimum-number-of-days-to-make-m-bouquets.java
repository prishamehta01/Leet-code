class Solution {
    public boolean possible(int[] bloomDay,int m,int k,int day){
        int cnt = 0;
        int numBoquets = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                cnt++;
            }
            else{
                numBoquets += (cnt/k);
                cnt = 0;
            }
        }
        numBoquets += (cnt/k);
        return numBoquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = bloomDay[0],high=bloomDay[0];
        for(int b:bloomDay){
            if(b<low) low = b;
            else if(b>high) high = b;
        }
        
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,m,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}