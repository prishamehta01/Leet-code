class Solution {
    public int maxSubArray(int[] nums) {
        int maxSumHere=nums[0];
        int maxSumSoFar=nums[0];
        for(int i=1;i<nums.length;i++){
            maxSumHere = Math.max(nums[i],maxSumHere+nums[i]);
            maxSumSoFar = Math.max(maxSumHere,maxSumSoFar);
        }
        return maxSumSoFar;
    }
}