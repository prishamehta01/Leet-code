class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        int len = pref.length();
        for(String s:strs){
            while(len>s.length() || (!pref.equals(s.substring(0,len)))){
                len--;
                if(len==0) return "";
                pref = pref.substring(0,len);
            }
        }
        return pref;
    }
}