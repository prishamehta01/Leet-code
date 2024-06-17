class Solution {
    public boolean judgeSquareSum(int c) {
        long beg=0,end=(long) Math.sqrt(c);
        while(beg<=end)
        {
            if(beg*beg + end*end == c)
            {
                return true;
            }
            else if(beg*beg + end*end > c)
            {
                end--;
            }
            else
            {
                beg++;
            }
        }
        return false;
    }
}
