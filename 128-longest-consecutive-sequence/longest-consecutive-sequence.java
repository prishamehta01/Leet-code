class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums) set.add(n);
        int longest = 0;
        for(int n:set){
            if(!set.contains(n-1)){
                int curr = n;
                int cnt = 1;
                while(set.contains(curr+1)){
                    cnt++;
                    curr++;
                }
                longest = Math.max(cnt,longest);
            }
            
        }
        return longest;
    }
}