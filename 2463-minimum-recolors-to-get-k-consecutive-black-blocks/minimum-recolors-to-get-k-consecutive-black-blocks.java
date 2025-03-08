class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;
        int minWhites = k;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whites++;
            }
        }
        minWhites = whites;
        for(int i=k;i<blocks.length();i++){
            if (blocks.charAt(i - k) == 'W') {
                whites--;
            }
            if (blocks.charAt(i) == 'W') {
                whites++;
            }
            minWhites = Math.min(minWhites,whites);
        }
        return minWhites;
    }
}