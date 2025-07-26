class Solution {
    public int romanToInt(String s) {
        char[] roman = {'I','V','X','L','C','D','M'};
        int[] integer = {1,5,10,50,100,500,1000};
        int res=0,num=0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            for(int j=0;j<roman.length;j++){
                if(roman[j]==c){
                    num = integer[j];
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