class Solution {
    public int trap(int[] height) {
        int res = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int n = height.length;
        maxLeft[0] = height[0];
        for(int i=1;i<n;i++){
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
        }
        maxRight[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i] = Math.max(maxRight[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            res+=Math.min(maxLeft[i],maxRight[i])-height[i];
        }
        return res;
    }
}