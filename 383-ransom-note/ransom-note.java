class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);

        for (char c : ransomNote.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));
            if (index == -1) {
                return false; // character not found in magazine
            }
            sb.deleteCharAt(index); // use the character only once
        }

        return true;
    }
}
