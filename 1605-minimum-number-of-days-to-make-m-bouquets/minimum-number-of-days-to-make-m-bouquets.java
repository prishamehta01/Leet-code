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
        return numBoquets>=m?true:false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = bloomDay[0],high=bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            if(bloomDay[i]<low) low = bloomDay[i];
            else if(bloomDay[i]>high) high = bloomDay[i];
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