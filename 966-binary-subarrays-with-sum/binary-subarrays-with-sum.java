class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0;
        map.put(0,1);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-goal)){
                cnt+= map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}