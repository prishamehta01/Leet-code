class Solution {
    public String removeOuterParentheses(String s) {
        int level = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(level>0)
                    sb.append(ch);
                level++;
            }
            else{
                level--;
                if(level>0)
                    sb.append(ch);
            }
        }
        return sb.toString();
    }
}