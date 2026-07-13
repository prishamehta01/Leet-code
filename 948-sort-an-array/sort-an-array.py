class Solution:
    def mergeSort(self,nums,low,high):
        if low>=high:
            return
        mid = (low+high)//2
        self.mergeSort(nums,low,mid)
        self.mergeSort(nums,mid+1,high)
        self.merge(nums,low,mid,high)

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
        

    def sortArray(self, nums: List[int]) -> List[int]:
        self.mergeSort(nums,0,len(nums)-1)
        return nums