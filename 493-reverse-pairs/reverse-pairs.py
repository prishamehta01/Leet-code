class Solution:
    def mergeSort(self,nums,low,high):
        cnt = 0
        if low>=high:
            return cnt
        mid = (low+high)//2
        cnt += self.mergeSort(nums,low,mid)
        cnt += self.mergeSort(nums,mid+1,high)
        cnt += self.countPairs(nums,low,mid,high)
        self.merge(nums,low,mid,high)
        return cnt

    def merge(self,nums,low,mid,high):
        left,right = low,mid+1
        temp = []
        while left<=mid and right<=high:
            if nums[left]<=nums[right]:
                temp.append(nums[left])
                left+=1
            else:
                temp.append(nums[right])
                right+=1
        while left<=mid:
            temp.append(nums[left])
            left+=1
        while right<=high:
            temp.append(nums[right])
            right+=1
        for i in range(len(temp)):
            nums[i+low] = temp[i]

    def countPairs(self,arr,low,mid,high):
        right = mid+1
        cnt = 0
        for i in range(low,mid+1):
            while(right<=high and arr[i]>(2*arr[right])):
                right+=1
            cnt += right-(mid+1)
        return cnt

    def reversePairs(self, nums: List[int]) -> int:
        return self.mergeSort(nums,0,len(nums)-1)
        