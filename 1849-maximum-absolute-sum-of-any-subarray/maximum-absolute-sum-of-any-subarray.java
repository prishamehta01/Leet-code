class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_sum = 0, min_sum = 0;
        int current_max = 0, current_min = 0;

        for (int num : nums) {
            current_max = Math.max(num, current_max + num);
            current_min = Math.min(num, current_min + num);
            max_sum = Math.max(max_sum, current_max);
            min_sum = Math.min(min_sum, current_min);
        }

        return Math.max(max_sum, Math.abs(min_sum));
    }
}