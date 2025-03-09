class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] nums=new int[colors.length+k-1];
        int i=0;
        for(int e:colors)nums[i++]=e;
        for(int j=0;j<k-1;j++) nums[i++]=colors[j];
        int left=0,right=0,count=0;
        while(right<nums.length){
            if(right!=0&&nums[right]==nums[right-1])left=right;
            if(right-left+1>=k){
                 count++;

            }
            right++;
        }
        return  count;
    }
}