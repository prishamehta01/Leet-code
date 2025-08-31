class Solution {
    public int xor(int[] nums){
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            num = nums[i]^num;
        }
        return num;
    }
    public int singleNonDuplicate(int[] nums) {
        int num = xor(nums);
        return num;
    }
}