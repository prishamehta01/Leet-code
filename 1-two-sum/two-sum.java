class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int left=0,right=nums.length-1;
        while(left<right){
            int sum = sorted[left]+sorted[right];
            if(sum==target){
                int index1=-1,index2=-1;
                for(int i=0;i<nums.length;i++){
                    if(index1==-1 && nums[i]==sorted[left]){
                        index1=i;
                    }
                    else if(nums[i]==sorted[right]){
                        index2 = i;
                    }
                }
                return new int[]{index1,index2};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }

        }
        return new int[]{};
    }
}