class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = -1;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                cnt=0;
            }
            max = Math.max(max,cnt);
        }
        return max;
    }
}