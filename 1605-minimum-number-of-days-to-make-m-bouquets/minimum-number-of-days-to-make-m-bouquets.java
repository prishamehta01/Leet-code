class Solution {
    private boolean possible(int[] bloomDay, int m, int k, int day) {
        int cnt = 0, bouquets = 0;
        for (int d : bloomDay) {
            if (d <= day) {
                cnt++;
                if (cnt == k) {
                    bouquets++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
            if (bouquets >= m) return true; // early stop
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1; // impossible case

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
