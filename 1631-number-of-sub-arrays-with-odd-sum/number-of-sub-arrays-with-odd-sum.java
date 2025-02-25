class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
    long count = 0;      // Store result safely
    long sum = 0;        // Use long for prefix sum
    long oddCount = 0;   
    long evenCount = 1;   // Start with 1 for subarrays starting at index 0
    
    for (int num : arr) {
        sum += num;
        
        if (sum % 2 != 0) { // odd prefix sum
            count = (count + evenCount) % MOD; // count subarrays with previous even prefix sums
            oddCount++;
        } else { // even prefix sum
            count = (count + oddCount) % MOD; // count subarrays with previous odd prefix sums
            evenCount++;
        }
    }
    
    return (int) (count % MOD);
    }
}