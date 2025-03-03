class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int index = 0;
        for(int x:nums){
            if(x<pivot) res[index++]=x;
        }
        for(int y:nums){
            if(y==pivot) res[index++] = y;
        }
        for(int z:nums){
            if(z>pivot) res[index++] = z;
        }
        return res;
    }
}