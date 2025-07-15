class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0,r=n-1;
        int maxL=0,maxR=0;
        int res = 0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>maxL){
                    maxL = height[l];
                }
                else{
                    res+= maxL-height[l];
                }
                l++;
            }
            else{
                if(height[r]>maxR){
                    maxR = height[r];
                }
                else{
                    res+= maxR - height[r];
                }
                r--;
            }
        }
        return res;
    }
}