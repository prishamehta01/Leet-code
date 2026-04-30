class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int cnt = 1;
        if(n==0) return 0;
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for(int it:nums){
            st.add(it);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                cnt = 1;
                int x = it;
                while(st.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}