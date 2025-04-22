class Solution {
    public int search(int[] nums, int target) {
        int beg = 0,end = nums.length-1;
        int res = -1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                res = mid;
            }
            if(nums[beg]<=nums[mid]){
                if(nums[beg]<=target && target<nums[mid]){
                    end = mid-1;
                }
                else{
                    beg = mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[end]){
                    beg = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            
        }
        return res;
    }
}