class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int beg = 0,end = numbers.length-1;
        while(beg<=end){
            if(numbers[beg]+numbers[end]==target){
                return new int[]{beg+1,end+1};
            }
            else if(numbers[beg]+numbers[end]<target){
                beg++;
            }
            else{
                end--;
            }
        }
        return new int[]{};
    }
}