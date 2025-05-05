class Solution {
    public String firstPalindrome(String[] words) {
        for(String w:words){
            boolean res = check(w);
            if(res){
                return w;
            }
        }
        return "";
    }
    public boolean check(String str){
        StringBuilder s = new StringBuilder(str);
        if(s.reverse().toString().equals(str)){
            return true;
        }
        return false;
    }
}