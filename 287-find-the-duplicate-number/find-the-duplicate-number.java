class Solution {
    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                high = mid; // Duplicate is in [low, mid]
            } else {
                low = mid + 1; // Duplicate is in [mid+1, high]
            }
        }
        return low;
    }
}
