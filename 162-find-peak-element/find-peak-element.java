class Solution {
    public int findPeakElement(int[] nums) {
        int beg = 0,end = nums.length-1;
        while(beg<end){
            int mid = (beg+end)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }
            else{
                beg = mid+1;
            }
        }
        return beg;
    }
}