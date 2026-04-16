class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1;
        int majorityEle = nums[0];
        for(int n:nums){
            if(n==majorityEle){
                cnt++;
            }
            else{
                cnt--;
                if(cnt==0){
                    majorityEle = n;
                    cnt= 1;
                }
            }
        }
        return majorityEle;
    }
}