class Solution {
    public int search(int[] nums, int target) {
        int l=0,e=nums.length-1;
        while(l<=e){
            int m = (l+e)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                l = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }
}