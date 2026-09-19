class Solution {
    public String reverseWords(String s) {
        String trimmedString = s.trim().replaceAll("\\s++"," ");
        String[] words = trimmedString.split("\\s");
        int left = 0,right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",words);
    }
}