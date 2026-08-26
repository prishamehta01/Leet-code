class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int medianIndex =  (n1+n2)/2;
        int i=0,j=0;
        int cur=0,prev=0;
        for(int cnt=0;cnt<=medianIndex;cnt++){
            prev = cur;
            if(i<n1 && (j>=n2 ||nums1[i]<nums2[j])){
                cur = nums1[i++];
            }
            else{
                cur = nums2[j++];
            }

        }
        double res = (n1+n2)%2==0?((cur+prev)/2.0):cur;
        return res;
    }
}