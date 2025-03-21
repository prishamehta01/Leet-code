class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String rev = new StringBuilder(cleaned).reverse().toString();

        if(cleaned.equals(rev))
        {
            return true;
        }
        else{
            return false;
        }
    }
}