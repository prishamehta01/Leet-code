class Solution {
    private boolean binarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,m = matrix[0].length;
        for(int i=0;i<n;i++){ 
            if(binarySearch(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
}