class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] res = {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(target-nums[i])){
                mp.put(nums[i],i);
            }
            else{
                res[0] = i;
                res[1] = mp.get(target-nums[i]);
                return res;
            }
            
        }
        return res;
    }
}