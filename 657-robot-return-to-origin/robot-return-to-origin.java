class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char c:moves.toCharArray()){
            if(c=='R') x++;
            else if(c=='L') x--;
            else if(c=='U') y++;
            else y--;
        }
        return x==0 && y==0;
    }
}