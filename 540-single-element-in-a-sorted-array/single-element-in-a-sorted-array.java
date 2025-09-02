class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=1,high=nums.length-2;
        int n = nums.length;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            //If i am on left side (even,odd)
            if(mid%2==0 && nums[mid]==nums[mid+1] || (mid%2==1 && nums[mid]==nums[mid-1])){
                low = mid+1;
            }
            else{
                //on the rigth side
                high = mid-1;
            }
        }
        return -1;
    }
}