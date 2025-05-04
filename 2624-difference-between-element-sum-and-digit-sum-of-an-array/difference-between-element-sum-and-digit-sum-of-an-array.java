class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0,digitSum=0;
        for(int i=0;i<nums.length;i++){
            eleSum+=nums[i];
            int a = nums[i];
            while(a!=0){
                digitSum+=(a%10);
                a = a/10;
            }
            
        }
        return Math.abs(eleSum-digitSum);
    }
}