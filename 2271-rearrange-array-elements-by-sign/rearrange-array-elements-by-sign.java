class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] rearrangedArray = new int[n];
        List<Integer> posArr = new ArrayList<>();
        List<Integer> negArr = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                posArr.add(nums[i]); 
            }
            else{
                negArr.add(nums[i]); 
            }
        }
        for(int i=0;i<n/2;i++){
            rearrangedArray[2*i]=posArr.get(i);
            rearrangedArray[2*i+1]=negArr.get(i);
        }
        return rearrangedArray;
    }
}