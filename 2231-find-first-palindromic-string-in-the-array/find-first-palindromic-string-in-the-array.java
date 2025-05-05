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
    public boolean check(String s){
       int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}