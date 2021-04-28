class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (String s: strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedString = String.valueOf(charArr);
            
           if (!map.containsKey(sortedString)) map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}