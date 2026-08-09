class Solution:
    def daysRequired(self,weights,capacity):
        days,curSum = 1,0
        for w in weights:
            if curSum+w<=capacity:
                curSum+=w
            else:
                days+=1
                curSum = w
        return days
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        low,high = max(weights),sum(weights)
        while low<=high:
            mid = low + (high-low)//2
            daysNeeded = self.daysRequired(weights,mid)
            if daysNeeded<=days:
                high = mid-1
            else:
                low = mid+1
        return low