class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {
       int n = nums.length;
       prefix = new int[n+1];
       int sum = 0;
       prefix[0] = 0;
       for(int i=1;i<prefix.length;i++){
            sum+=nums[i-1];
            prefix[i] = sum;
       }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefix[right+1];
        return prefix[right+1] - prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */