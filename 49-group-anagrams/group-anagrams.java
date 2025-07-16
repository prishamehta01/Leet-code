class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedKey = new String(c);
            if(!hm.containsKey(sortedKey)){
                hm.put(sortedKey,new ArrayList<>());
            }
            hm.get(sortedKey).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}