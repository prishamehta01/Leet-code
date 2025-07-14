class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefXor = new int[arr.length+1];
        prefXor[0] = 0; //always 0
        for(int i=0;i<arr.length;i++){
            prefXor[i+1] = prefXor[i]^arr[i];
        }
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = prefXor[r+1]^prefXor[l];
        }
        return res;
    }
}