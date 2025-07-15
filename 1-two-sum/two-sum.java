class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int moreNeeded = target - nums[i];
            if(hp.containsKey(moreNeeded)){
                return new int[]{i,hp.get(moreNeeded)};
            }
            hp.put(nums[i],i);
        }
        return new int[]{};
    }
}