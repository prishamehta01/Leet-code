class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int maxL=0,maxR=0;
        int water = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(maxL<height[l]) maxL = height[l];
                else water+= maxL-height[l];
                l++;
            }
            else{
                if(maxR<height[r]) maxR = height[r];
                else water += maxR-height[r];
                r--;
            }
        }
        return water;
    }
}