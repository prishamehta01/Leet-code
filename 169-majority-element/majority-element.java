class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int maxCnt = 0;
        int res=0;
        for(int key:map.keySet()){
            int value = map.get(key);
            if(value>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}