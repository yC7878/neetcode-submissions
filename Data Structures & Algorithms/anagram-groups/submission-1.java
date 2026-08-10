class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String newKey = new String(charArray);

            if(anagramMap.containsKey(newKey)){
                anagramMap.get(newKey).add(str);
            }else{
                List<String> group = new ArrayList<>();
                group.add(str);
                anagramMap.put(newKey, group);
            }
        }
        return new ArrayList<>(anagramMap.values());
    }
}
