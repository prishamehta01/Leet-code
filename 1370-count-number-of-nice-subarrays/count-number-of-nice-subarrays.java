class Solution {
    public int function(int[] nums,int k){
        //for sum<=k
        int l=0,r=0,sum=0,cnt=0;
        while(r<nums.length){
            sum+=(nums[r]%2);
            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            cnt = cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return function(nums,k)-function(nums,k-1);
    }
}