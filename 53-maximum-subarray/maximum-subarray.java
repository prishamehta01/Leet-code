class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int x:nums){
            sum+=x;
            maxi = sum>maxi?sum:maxi;
            if(sum<0) sum=0;
        }
        return maxi;
    }
}