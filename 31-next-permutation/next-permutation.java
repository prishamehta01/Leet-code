class Solution {
    public void rev(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left]= nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        rev(nums,index+1,nums.length-1);
    }
}