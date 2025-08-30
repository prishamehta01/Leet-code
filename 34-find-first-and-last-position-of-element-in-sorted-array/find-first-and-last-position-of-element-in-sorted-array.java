class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = {-1,-1};
        //First position
        int beg=0,end=n-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                res[0] = mid;
                end = mid-1;
            }
            else if(target>nums[mid]){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        //Last position
        beg=0;end=n-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                res[1] = mid;
                beg = mid+1;
            }
            else if(target>nums[mid]){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return res;
    }
}