class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        int prefLen = pref.length();
        for(String s:strs){
            while(prefLen>s.length() || !pref.equals(s.substring(0,prefLen))){
                prefLen--;
                if(prefLen==0){
                    return "";
                }
                pref = pref.substring(0,prefLen);
            }
        }
        return pref;
    }
}