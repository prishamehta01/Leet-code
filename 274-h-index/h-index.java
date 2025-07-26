class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int left = 0, right = n - 1;
        int hIndex = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int h = n - mid; // number of papers with at least citations[mid] citations

            if (citations[mid] >= h) {
                hIndex = h; // candidate for h-index
                right = mid - 1; // try to find a better (higher) h to the left
            } else {
                left = mid + 1; // move right
            }
        }

        return hIndex;
    }
}
