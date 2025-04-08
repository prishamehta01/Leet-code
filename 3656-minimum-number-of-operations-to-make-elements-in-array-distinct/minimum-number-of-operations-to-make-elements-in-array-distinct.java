class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] present = new boolean[128];
        for(int i=nums.length-1;i>=0;i--){
            if(present[nums[i]]){
                return (i+3)/3;
            }
            present[nums[i]] = true;
        }
        return 0;
    }
}