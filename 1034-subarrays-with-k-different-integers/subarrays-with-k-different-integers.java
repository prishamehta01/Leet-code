class Solution {
    public int function(int[] nums,int k){
        //no of subarrays<=k
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0,l=0,r=0;
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            cnt=cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return function(nums,k)-function(nums,k-1);
    }
}