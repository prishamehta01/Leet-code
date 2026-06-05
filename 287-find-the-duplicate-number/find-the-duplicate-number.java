class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> map: hm.entrySet()){
            if(map.getValue()>1) return map.getKey();
        }
        return -1;
    }
}