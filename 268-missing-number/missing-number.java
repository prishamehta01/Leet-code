class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_sum = (n*(n+1))/2;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        int missing_num = actual_sum-sum;
        return missing_num;
    }
}