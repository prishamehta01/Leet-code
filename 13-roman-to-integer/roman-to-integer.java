class Solution {
    public int romanToInt(String s) {
        int[] nums = {1,5,10,50,100,500,1000};
        char[] roman = {'I','V','X','L','C','D','M'};
        int res = 0,prev = 0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int num = 0;
            for(int j =0;j<roman.length;j++){
                if(roman[j]==c){
                    num = nums[j];
                    break;
                }
            }
            if(prev>num){
                res-=num;
            }
            else{
                res+=num;
            }
            prev = num;
        }
        return res;
    }
}