class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j=n-1;
        int last = m+n-1;
        if(nums2==null) return;
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[last] = nums2[j];
                j--;
            }
            else{
                nums1[last] = nums1[i];
                i--;
            }
            last--;
        }
        while(j>=0){
            nums1[last] = nums2[j];
            j--;
            last--;
        }
    }
}