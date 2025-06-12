class Solution {
    public int strStr(String haystack, String needle) {
        int windowSize = needle.length();
        for(int i=0;i<=haystack.length()-windowSize;i++){
            if(haystack.substring(i,i+windowSize).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}