class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        res[0] = res[1] = -1;
        for(int i = 0;i< nums.length; i++){
            int num = nums[i];
            int moreneeded = target - num;
            if(mp.containsKey(moreneeded)){
                res[0] = mp.get(moreneeded);
                res[1] = i;
                return res;
            }
            mp.put(nums[i],i);
        }
        return res;
    }
}