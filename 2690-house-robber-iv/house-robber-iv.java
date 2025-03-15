class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Arrays.stream(nums).min().getAsInt();
        int right = Arrays.stream(nums).max().getAsInt();

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            
            // Greedy approach to check if we can rob at least k houses with maxMoney <= mid
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                    i++;  // Skip next house to ensure non-adjacent selection
                }
            }

            if (count >= k) {
                right = mid;  // Try to minimize the maximum stolen amount
            } else {
                left = mid + 1;  // Increase capability if k houses can't be robbed
            }
        }

        return left;
    }
}