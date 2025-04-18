class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += 2 * numRows - 2) {
                result.append(s.charAt(j));
                
                // For middle rows, add the diagonal character
                int diagonal = j + (2 * numRows - 2) - 2 * i;
                if (i != 0 && i != numRows - 1 && diagonal < s.length()) {
                    result.append(s.charAt(diagonal));
                }
            }
        }
        return result.toString();
    }
}
