class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            // Return false if lengths don't match
            return false;
        }
        String newStr = s+s;
        if(newStr.contains(goal)) return true;
        return false;
    }
}