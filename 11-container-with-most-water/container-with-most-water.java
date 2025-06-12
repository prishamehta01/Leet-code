class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxCon = Integer.MIN_VALUE;
        while(left<right){
            if(height[left]<height[right]){
                int width = right-left;
                int heigh = Math.min(height[left],height[right]);
                maxCon = Math.max(maxCon,width*heigh);
                left++;
            }
            else{
                int width = right-left;
                int heigh = Math.min(height[left],height[right]);
                maxCon = Math.max(maxCon,width*heigh);
                right--;
            }
        }
        return maxCon;
    }
}