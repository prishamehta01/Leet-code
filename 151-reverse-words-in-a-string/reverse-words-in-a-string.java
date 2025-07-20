class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split("\\s+");
        int left=0,right=strs.length-1;
        while(left<right){
            String temp = strs[left];
            strs[left] = strs[right];
            strs[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",strs);
    }
}