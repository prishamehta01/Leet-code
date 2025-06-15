class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        String t = s;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='9'){
                s = s.replace(s.charAt(i),'9');
                break;
            }
        }
        if(t.charAt(0)!='1'){
            t = t.replace(t.charAt(0),'1');
        }
        else{
            for(int i=1;i<t.length();i++){
                if(t.charAt(i)!='1' && t.charAt(i)!='0'){
                    t = t.replace(t.charAt(i),'0');
                    break;
                }
            }
        }
        return Integer.parseInt(s)-Integer.parseInt(t);
    }
}