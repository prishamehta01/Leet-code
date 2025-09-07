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
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int low=min,high=max,ans=-1;
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