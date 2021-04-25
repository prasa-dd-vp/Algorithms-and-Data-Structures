class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        String[] digitsMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        if (digits.length() == 0) {
            return result;
        }
        
        backTrack(result, digitsMap, "", digits);
        
        return result;
    }
    
    private void backTrack (List<String> result, String[] digitsMap, String s, String digits) {
        if (s.length() == digits.length()) {
            result.add(s);
            return;
        }
        
        int digitIndex = s.length();
        for (Character c: digitsMap[digits.charAt(digitIndex)-'0'].toCharArray()) {
            backTrack(result, digitsMap, s+c, digits);
        }
    }
    
}