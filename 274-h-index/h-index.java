class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int maxH = 0;

        for (int h = 0; h <= n; h++) {
            int count = 0;
            for (int c : citations) {
                if (c >= h) {
                    count++;
                }
            }
            if (count >= h) {
                maxH = h;  // we try to maximize h
            }
        }

        return maxH;
    }
}
