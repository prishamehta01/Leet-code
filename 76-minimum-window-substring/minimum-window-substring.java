class Solution {
    public String minWindow(String s, String t) {
        int n=s.length(),m=t.length();
        int l=0,r=0,cnt=0,startI=-1,minLen=Integer.MAX_VALUE;
        int[] hash = new int[256];
        for(int i=0;i<m;i++) hash[t.charAt(i)]++;
        while(r<n){
            if(hash[s.charAt(r)]>0) cnt++;
            hash[s.charAt(r)]--;
            while(cnt==m){
                if((r-l+1) < minLen){
                    minLen = r-l+1;
                    startI = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0) cnt--;
                l++;
            }
            r++;
        }
        return startI==-1?"":s.substring(startI,startI+minLen);
    }
}