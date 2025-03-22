class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        double res = Math.log(n)/Math.log(2);
        return Math.abs(res - Math.round(res)) < 1e-10;
    }
}