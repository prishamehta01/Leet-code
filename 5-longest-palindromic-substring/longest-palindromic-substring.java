class Solution {
    private int expand(String s, int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        if(s.length()<0 || s==null){
            return "";
        }
        int start = 0,end=0;
        for(int i=0;i<s.length();i++){
            int oddLen = expand(s,i,i);
            int evenLen = expand(s,i,i+1);
            int len = Math.max(oddLen,evenLen);
            if(len>(end-start)){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
}