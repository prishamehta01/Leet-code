class Solution:
    def mergeSort(self,nums):
        if len(nums)<=1:
            return nums
        mid = len(nums)//2
        left = self.mergeSort(nums[:mid])
        right = self.mergeSort(nums[mid:])
        return self.merge(left,right)

    def merge(self,left,right):
        i=j=0
        temp = []
        while i < len(left) and j < len(right):
            if left[i] <= right[j]:
                temp.append(left[i])
                i += 1
            else:
                temp.append(right[j])
                j += 1
        temp.extend(left[i:])
        temp.extend(right[j:])
        return temp
        

    def sortArray(self, nums: List[int]) -> List[int]:
        return self.mergeSort(nums)