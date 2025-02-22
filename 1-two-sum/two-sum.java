class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];  // value
            pairs[i][1] = i;        // original index
        }
        
        // Sort based on values
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        
        // Two pointer approach
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{};
    }
}