class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }   //To make sure it stays at the 1st occurance of 0
        }
        if(j==-1) return; //There are no zeros in the array

        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int tmp = nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                j++;
            }
        }
    }
}