class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int beg = 0,end = nums.length-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                res[0] = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        beg = 0;
        end = nums.length-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                res[1] = mid;
                beg = mid+1;
            }
            else if(nums[mid]<target){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
}