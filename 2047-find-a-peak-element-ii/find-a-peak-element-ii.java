class Solution {
    private int findRowIndex(int[][]mat,int n, int m, int col){
        int maxEle = -1, index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>maxEle){
                maxEle = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int max = -1;
        int n = mat.length,m = mat[0].length;
        int[] ans = {-1,-1};
        int low = 0,high = m-1;
        while(low<=high){
            int mid = (low+high)/2; //col
            int maxIndexRow = findRowIndex(mat,n,m,mid); //row that contains max ele in that col
            int left  = mid-1>=0?mat[maxIndexRow][mid-1]:-1;
            int right  = mid+1<m?mat[maxIndexRow][mid+1]:-1;
            if(mat[maxIndexRow][mid]>left && mat[maxIndexRow][mid]>right){
                ans[0] = maxIndexRow;
                ans[1] = mid;
                return ans;
            }
            else if(mat[maxIndexRow][mid]<left){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}