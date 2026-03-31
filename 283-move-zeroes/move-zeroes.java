class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int n:nums){
            if(n!=0) al.add(n);
        }
        int size = al.size();
        for(int i=0;i<size;i++){
            nums[i] = al.get(i);
        }
        for(int i=size;i<len;i++){
            nums[i] = 0;
        }
    }
}