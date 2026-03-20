class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int n:nums){
            if(!ar.contains(n)){
                ar.add(n);
            }
        }
        for(int i=0;i<ar.size();i++){
            nums[i] = ar.get(i);
        }
        return ar.size();
    }
}