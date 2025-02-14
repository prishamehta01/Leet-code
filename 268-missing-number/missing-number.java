class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int arraySum = 0;
        for(int x:nums){
            arraySum+=x;
        }
        int number = expectedSum - arraySum;
        return number;
    }
}