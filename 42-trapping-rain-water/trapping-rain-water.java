class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0,right=n-1;
        int maxLeft = height[0];
        int maxRight = height[n-1];
        int water = 0;
        while(left<right){
            if(height[left]<height[right]){
               if(height[left]>maxLeft){
                    maxLeft = height[left];
               }
               else{
                water+= maxLeft - height[left];
               }
               left++;
            }
            else{
                if(maxRight<height[right]){
                    maxRight = height[right];
                }
                else{
                    water+=maxRight-height[right];
                }
                right--;
            }
        }
        return water;
    }
}