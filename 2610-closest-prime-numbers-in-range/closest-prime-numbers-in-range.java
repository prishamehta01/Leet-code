class Solution {
    public int[] closestPrimes(int left, int right) {
        if (right < 2 || left > right) {
            return new int[]{-1, -1};
        }

        // Sieve of Eratosthenes to find primes up to 'right'
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect primes in range [left, right]
        List<Integer> primes = new ArrayList<>();
        for (int i = Math.max(2, left); i <= right; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        // If less than 2 primes found, return [-1, -1]
        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        // Find closest prime pair
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }
        return result;
    }
}