class Solution {
    public int maxSubArray(int[] nums) {
        int maxUntilHere = nums[0];
        int maxSumSoFar = nums[0];
        for(int i=1;i<nums.length;i++){
            maxUntilHere = Math.max(nums[i],maxUntilHere+nums[i]);
            maxSumSoFar = Math.max(maxSumSoFar, maxUntilHere);
        }
        return maxSumSoFar;
    }
}