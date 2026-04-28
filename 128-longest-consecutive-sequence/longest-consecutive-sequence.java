class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int cnt = 1,max = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
                cnt++;
                max = Math.max(cnt,max);
            }
            else{
                cnt = 1;
            }
        }
        return max;
    }
}