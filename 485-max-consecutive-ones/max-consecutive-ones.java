class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max_count = 0;
    for (int num : nums) {
        if (num == 1) {
            count++;
        } else {
            max_count = Math.max(max_count, count);
            count = 0;
        }
    }
    return Math.max(max_count, count);
    }
}