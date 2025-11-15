class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        HashMap<Character,String> charToWord = new HashMap<>();
        HashMap<String,Character> wordToChar = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(charToWord.containsKey(pattern.charAt(i))){
                if(!charToWord.get(pattern.charAt(i)).equals(words[i])) return false;
            }
            else if (wordToChar.containsKey(words[i])) {
                return false;
            }
            else{
                charToWord.put(pattern.charAt(i), words[i]);
                wordToChar.put(words[i], pattern.charAt(i));
            }
        }
        return true; 
    }
}