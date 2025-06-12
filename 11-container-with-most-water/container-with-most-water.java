class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxCon = Integer.MIN_VALUE;
        while(left<right){
            maxCon = Math.max(maxCon,(right-left)*(Math.min(height[left],height[right])));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxCon;
    }
}