class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] fibSeries = new int[n];
        fibSeries[0] = 1;
        fibSeries[1] = 1;
        for(int i=2;i<n;i++){
            fibSeries[i]=fibSeries[i-1]+fibSeries[i-2];
        }
        return fibSeries[n-1];
    }
}