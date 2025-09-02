class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return Collections.emptyList();
        }
        int m = strs.length;
        String sortedArray[] = new String[m];
        HashMap<String, List<String>> groupMap = new HashMap<>();
        for(int i=0; i<m; i++){
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            sortedArray[i] = new String(tempArray);
        }
        for(int i=0; i<m; i++){
            String key = sortedArray[i];
            String original = strs[i];
            if(!groupMap.containsKey(key)){
                groupMap.put(key, new ArrayList<>());
            }
            groupMap.get(key).add(original);
        }
        return new ArrayList<>(groupMap.values());
    }
}