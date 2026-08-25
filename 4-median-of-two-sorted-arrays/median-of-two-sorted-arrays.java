class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1+n2];
        int i=0;
        for(int n:nums1){
            merged[i++] = n;
        }
        for(int n:nums2){
            merged[i++] = n;
        }
        int newLen = n1+n2;
        Arrays.sort(merged);
        int medianIndex =  newLen/2;
        double res = newLen%2==0?((merged[medianIndex]+merged[medianIndex-1])/2.0):merged[medianIndex];
        return res;
    }
}