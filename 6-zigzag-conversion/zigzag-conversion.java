class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2; // The repeating pattern length

        for (int row = 0; row < numRows; row++) {
            for (int j = row; j < n; j += cycleLen) {
                result.append(s.charAt(j)); // Vertical column char

                // For middle rows, also add diagonal char (if within bounds)
                int diagIdx = j + cycleLen - 2 * row;
                if (row != 0 && row != numRows - 1 && diagIdx < n) {
                    result.append(s.charAt(diagIdx));
                }
            }
        }

        return result.toString();
    }
}