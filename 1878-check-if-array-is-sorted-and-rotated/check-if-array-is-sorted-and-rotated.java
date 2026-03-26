class Solution {
    public static boolean isSorted(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int[] rotated = new int[n];
            for(int j = 0;j<n;j++){
                rotated[j] = nums[(i+j)%n];
            }
            if(isSorted(rotated)) return true;
        }
        return false;
    }
}