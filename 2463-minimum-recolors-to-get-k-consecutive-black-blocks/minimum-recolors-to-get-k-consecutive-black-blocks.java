class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minWhites=k;
        for(int i=0;i<=blocks.length()-k;i++){
            int whites=0;
            for(int j=0;j<k;j++){
                if(blocks.charAt(i+j)=='W'){
                    whites++;
                }
            }
            minWhites = Math.min(minWhites,whites);
        }
        return minWhites;
    }
}