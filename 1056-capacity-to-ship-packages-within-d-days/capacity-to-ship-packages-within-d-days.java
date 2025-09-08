class Solution {
    public int function(int[] weights,int capacity){
        int days = 1,load=0;
        for(int w:weights){
            if(load+w>capacity){
                days = days+1;
                load = w;
            }
            else{
                load+=w;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0],sum=weights[0];
        for(int i=1;i<weights.length;i++){
            if(weights[i]>max) max = weights[i];
            sum+=weights[i];
        }
        int low = max,high = sum;
        while(low<=high){
            int mid = (low+high)/2; //capacity
            int numDays = function(weights,mid);
            if(numDays<=days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}