class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // Step 1: Give 1 candy to each
        
        boolean changed = true;
        
        while (changed) { 
            changed = false;
            
            for (int i = 0; i < n; i++) {
                // Check left neighbor
                if (i > 0 && ratings[i] > ratings[i-1] && candies[i] <= candies[i-1]) {
                    candies[i] = candies[i-1] + 1;
                    changed = true;
                }
                // Check right neighbor
                if (i < n-1 && ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]) {
                    candies[i] = candies[i+1] + 1;
                    changed = true;
                }
            }
        }
        
        int sum = 0;
        for (int c : candies) sum += c;
        return sum;
    }
}
