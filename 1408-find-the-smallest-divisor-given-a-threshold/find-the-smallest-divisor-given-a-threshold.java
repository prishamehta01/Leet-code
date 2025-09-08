class Solution {
    public boolean isDivisible(int[] nums,int threshold,int num){
        int sum=0;
        for(int n:nums){
            sum+=Math.ceil(n/(double)num);
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Arrays.stream(nums).max().getAsInt();
        int low=1,high=max,ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(isDivisible(nums,threshold,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}