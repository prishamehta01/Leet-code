class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int k = set.size();
        int i =0;
        for(int x:set){
            nums[i++]=x;
        }
        Arrays.sort(nums, 0 , k);
        return k;
    }
}