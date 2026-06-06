class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long)(n*n);
        long expectedSum = (N*(N+1))/2;
        long expectedSq = (N*(N+1)*((2*N)+1))/6;
        long actualSum = 0;
        long actualSq = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                actualSum+=grid[i][j];
                actualSq+=(long)(grid[i][j])*grid[i][j];
            }
        }
        long D = actualSum - expectedSum;
        long E = actualSq - expectedSq;
        long sumXY = E/D;
        int repeated = (int)((sumXY+D)/2);
        int missing = (int)(sumXY-repeated);
        return new int[]{repeated,missing};
    }
}