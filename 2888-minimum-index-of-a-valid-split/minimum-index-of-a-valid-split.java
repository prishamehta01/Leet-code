class Solution {
    public int minimumIndex(List<Integer> nums) {
        int cnt = 0;
        int c = nums.get(0);
        for(int n:nums){
            if(n==c){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt == 0){
                c = n;
                cnt = 1;
            }
        }
        int dominating_num = c;
        int count = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==dominating_num){
                count++;
            }
        }
        int prefixCnt = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==dominating_num){
                prefixCnt++;
            }
            if(prefixCnt*2>(i+1) && (count-prefixCnt)*2>(nums.size()-i-1)) return i;
        }
        return -1;
    }
}