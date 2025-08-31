class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        if(nums.length==0) return 0;
        int longest = 1;
        for(int n:nums) hs.add(n);
        for(int it:hs){
            if(!hs.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(hs.contains(x+1)){
                    x = x+1;
                    cnt = cnt+1;
                }
                longest = Math.max(cnt,longest); 
            }
        }
        return longest;
    }
}