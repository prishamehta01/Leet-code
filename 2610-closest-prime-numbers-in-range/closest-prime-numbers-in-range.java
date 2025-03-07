class Solution {
    public int[] closestPrimes(int left, int right) {
        if (right < 2 || left > right) return new int[]{-1, -1};

        // Step 1: Sieve of Eratosthenes
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Find closest prime pair
        int prevPrime = -1;
        int[] result = {-1, -1};
        int minDiff = Integer.MAX_VALUE;

        for (int i = Math.max(left, 2); i <= right; i++) {
            if (isPrime[i]) {
                if (prevPrime != -1 && (i - prevPrime) < minDiff) {
                    minDiff = i - prevPrime;
                    result[0] = prevPrime;
                    result[1] = i;
                }
                prevPrime = i;
            }
        }

        return result;
    }
}