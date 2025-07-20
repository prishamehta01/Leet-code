class Solution {
    public String intToRoman(int num) {
        int[] integer = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        String romanVal = new String();
        while(num>0){
            if(num>=integer[i]){
                romanVal+=roman[i];
                num-=integer[i];
            }
            else{
                i++;
            }
        }
        return romanVal;
    }
}