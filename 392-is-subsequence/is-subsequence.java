class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0; //subs s
        for(int j=0;j<t.length();j++){ //string t
            if(i<s.length() && s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==s.length();
    }
}