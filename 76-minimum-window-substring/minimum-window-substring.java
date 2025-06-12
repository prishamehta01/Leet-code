class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : t.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int left=0;
        int minlen = Integer.MAX_VALUE;
        int start=0;
        int count=0;
        HashMap<Character,Integer> window = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(mp.containsKey(c) && window.get(c)<=mp.get(c)){
                count++;
            }
            while(count==t.length()){
                if(right-left+1<minlen){
                    minlen = right-left+1;
                    start = left;
                }
                char ch = s.charAt(left);
                window.put(ch,window.get(ch)-1);

                if(mp.containsKey(ch) && window.get(ch)<mp.get(ch)){
                    count--;
                }
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE) return "";
        return s.substring(start,start+minlen);
    }
}