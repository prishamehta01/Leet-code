class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int beg = 0,end = numbers.length-1;
        while(beg<=end){
            if(numbers[beg]+numbers[end]==target){
                res[0] =beg+1;
                res[1]= end+1;
                break;
            }
            else if(numbers[beg]+numbers[end]<target){
                beg++;
            }
            else{
                end--;
            }
        }
        return res;
    }
}