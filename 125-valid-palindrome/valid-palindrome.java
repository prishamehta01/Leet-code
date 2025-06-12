class Solution {
    public boolean isPalindrome(String s) {
        String update = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String rev = new StringBuilder(update).reverse().toString();
        return rev.equals(update);

    }
}