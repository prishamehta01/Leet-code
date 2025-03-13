class Solution {
    public void rev(int[] a, int left, int right){
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            rev(nums,0,nums.length-1);
            return;
        }

        for(int j=nums.length-1;j>index;j--){
            if(nums[j]>nums[index]){
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        rev(nums,index+1,nums.length-1);
    }
}