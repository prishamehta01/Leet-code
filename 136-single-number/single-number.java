class Solution {
    public int singleNumber(int[] nums) {
        int singleNum=0;
        for(int x:nums){
            singleNum = singleNum^x;
        }
        return singleNum;
    }
}