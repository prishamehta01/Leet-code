class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
        long count = 0;     
        long sum = 0;       
        long oddCount = 0;   
        long evenCount = 1;  
        
        for (int num : arr) {
            sum += num;
            if (sum % 2 != 0) { 
                count = (count + evenCount) % MOD;       
                oddCount++;
            } 
            else {
                count = (count + oddCount) % MOD; 
                evenCount++;
            }
        }
        
        return (int) (count % MOD);
    }
}