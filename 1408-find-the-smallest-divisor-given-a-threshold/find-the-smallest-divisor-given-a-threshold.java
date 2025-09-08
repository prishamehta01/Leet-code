class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // in this we have to find We want the smallest divisor such that the sum of (ceil(nums[i]/divisor)) is ≤ threshold
        // then we have to create a sum function which calculate the sum is grater or less than the threshold
        // then we have to find out the low and high and apply binary search 

        

        int n = nums.length;

        // edge case 
        if(n > threshold) return -1;

        
       int max = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++){
        max = Math.max(nums[i] , max);
        }

        int low = 1 , high = max;

        while(low <= high){

            int mid = (low + high ) / 2;

            if(sum(nums,mid) <= threshold){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }

        return low;
    }

    public static int sum(int [] nums, int div){

        int n = nums.length;
         int sum = 0;
        for(int i = 0; i < n ;i++){
         
          sum += Math.ceil((double)(nums[i])/(double)div);
            
        }
        return sum;
    }
}