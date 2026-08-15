class Solution:
    def allocationPossible(self,arr,maxAllocation,numOfSubarrays):
        allocatedArrays = 1
        sum = 0
        for i in range(len(arr)):
            if arr[i]>maxAllocation:
                return False
            if (sum+arr[i])>maxAllocation:
                allocatedArrays+=1
                sum = arr[i]
            else:
                sum+=arr[i]
        return allocatedArrays<=numOfSubarrays
         
        
    def splitArray(self, nums: List[int], k: int) -> int:
        ans = -1
        # code here
        if len(nums)<k:
            return -1
        low,high =  min(nums),sum(nums)
        while low<=high:
            mid = (low+high)//2
            if self.allocationPossible(nums,mid,k):
                ans = mid
                high = mid-1
            else: 
                low = mid+1
        return ans
            
    
        