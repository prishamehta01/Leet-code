class Solution {
    public int strStr(String haystack, String needle) {
        int subsLen = needle.length();
        for(int i=0,j=subsLen;j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}