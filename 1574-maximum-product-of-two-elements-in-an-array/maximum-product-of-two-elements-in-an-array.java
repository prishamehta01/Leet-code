class Solution {
    public int maxProduct(int[] nums) {
        int max= Integer.MIN_VALUE,sec_max=Integer.MIN_VALUE;
        int n  = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                sec_max = max;
                max = nums[i];
            }
            else if(nums[i]>=sec_max){
                sec_max = nums[i];
            }
        }
        return (max-1)*(sec_max-1);
    }
}