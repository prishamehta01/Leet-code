class Solution {
    public static void rev(int[] a){
        int i = 0 ;
        int j = a.length-1;
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        int[] newArr = new int[arr.length];
        newArr[0]= -1;
        int max = -1;
        int j=1;
        for(int i=arr.length-1;i>=0;i--){
                max = Math.max(max,arr[i]);
                if(j!=arr.length){
                    newArr[j++]= max;
                }
        }
        rev(newArr);
        return newArr;
    }
}