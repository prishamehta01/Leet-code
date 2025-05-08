class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        int res;
        if(num<10){
            return num;
        }
        while(num>=10){
            res = 0;
            while(num!=0){
                res+=(num%10);
                num/=10;
            }
            num = res;
        }
        return num;
    }
}