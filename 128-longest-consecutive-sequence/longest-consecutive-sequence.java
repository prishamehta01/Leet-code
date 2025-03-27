class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int longest = 1;
        int cnt = 0;
        int smaller_no = Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]-1==smaller_no){
                cnt++;
                smaller_no = nums[i];
            }
            else if(nums[i]!=smaller_no){
                cnt = 1;
                smaller_no = nums[i];
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
}