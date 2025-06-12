class Solution {
    public boolean isPalindrome(String s) {
        String update = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = update.length()-1;
        while(left<right){
            if(update.charAt(left)!=update.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}