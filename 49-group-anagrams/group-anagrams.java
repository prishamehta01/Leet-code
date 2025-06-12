class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String SortedKey = new String(chars);

            if(!map.containsKey(SortedKey)){
                map.put(SortedKey,new ArrayList<>());
            }
            map.get(SortedKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
}