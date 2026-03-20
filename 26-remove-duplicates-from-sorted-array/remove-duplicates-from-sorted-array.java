class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(hs);
       Collections.sort(ar);
       for(int i=0;i<hs.size();i++){
        nums[i] = ar.get(i);
       }
       return ar.size();
    }
}