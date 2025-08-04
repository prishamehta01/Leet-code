class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<words.length){
            int lineLen = 0;
            int j = i;
            while(j<words.length && lineLen+words[j].length()+(j-i)<=maxWidth){
                lineLen+=words[j].length();
                j++;
            }
            StringBuilder line = new StringBuilder();
            int numWords = j-i;
            int totalSpaces = maxWidth - lineLen;
            if(j==words.length || numWords==1){
                for(int k=i;k<j;k++){
                    line.append(words[k]);
                    if(k<j-1) line.append(" ");
                }
                int remaining = maxWidth-line.length();
                for(int s=0;s<remaining;s++){
                    line.append(" ");
                }
            }
            else{
                int spaceBtwnWords = totalSpaces/(numWords-1);
                int extraSpace = totalSpaces % (numWords-1);
                for(int k=i;k<j;k++){
                    line.append(words[k]);
                    if(k<j-1){
                        int spaces = spaceBtwnWords + (extraSpace-- > 0? 1:0);
                        for(int s=0;s<spaces;s++){
                            line.append(" ");
                        }
                    }
                }
            }
            res.add(line.toString());
            i = j;
        }
        return res;
    }
}