class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0,sum = 0,oddCount = 0,evenCount = 1;
        final int Mod = 1000000007;
        for(int x:arr){
            sum+=x;
            if((sum%2)!=0){
                count = (count+evenCount)%Mod;
                oddCount++;
            }
            else{
                count = (count+oddCount)%Mod;
                evenCount++;
            }
        }
        return (count%Mod);
    }
}