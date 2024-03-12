class Solution {
    public int maximumWealth(int[][] accounts) {
      int sum=0;
      for(int i=0;i<accounts.length;i++)
      {
        int temp=0;
        for(int j=0;j<accounts[i].length;j++)
        {
            temp=temp+accounts[i][j];
        }
        sum=Math.max(sum,temp); 
        /*if(max<=temp)
            max=temp;
        temp=0;*/
      }  
      return sum;
    }
}