class Solution {
    public int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        
        if (totalCandies < k) {
            return 0; // Not enough candies for each child to get at least one
        }

        long left = 1, right = totalCandies;
        int res = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long count = 0;

            for (int candy : candies) {
                count += candy / mid;
            }

            if (count >= k) { // Can satisfy k children with mid candies each
                res = (int) mid; // Store the valid result
                left = mid + 1;  // Try for more candies
            } else {
                right = mid - 1; // Reduce the candies per child
            }
        }

        return res;
    }
}