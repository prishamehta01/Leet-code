class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int s = 0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                if(s==k){
                    res++;
                }
            }
        }
        return res;
    }
}