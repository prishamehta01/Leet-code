class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> eq = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) less.add(nums[i]);
            else if(nums[i]==pivot) eq.add(nums[i]);
            else more.add(nums[i]);
        }
        int index = 0;
        for(int x:less){
            nums[index++]=x;
        }
        for(int y:eq){
            nums[index++] = y;
        }
        for(int z:more){
            nums[index++] = z;
        }
        return nums;
    }
}