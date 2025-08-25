class Solution {
    public int function(int[] nums,int k){
        //cnt subarrays whose sum<=k
        if(k<0) return 0;
        int cnt=0,l=0,r=0,sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return function(nums,goal)-function(nums,goal-1);
    }
}