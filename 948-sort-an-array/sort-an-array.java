class Solution {
    public void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int k=0;
        int left = low, right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right])
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[right++];
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
    public void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        mergeSort(nums,0,n-1);
        return nums;
    }
}