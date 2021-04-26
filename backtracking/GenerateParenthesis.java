class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        
        backTrack(result, "", 0, 0, n);
        
        return result;
    }
    
    private void backTrack(List<String> result, String s, int open, int close, int max) {
        
        if (s.length() == max *2) {
            result.add(s);
            return;
        }
        
        if (open < max) backTrack(result, s+"(", open+1, close, max);
        if (close < open) backTrack(result, s+")", open, close+1, max);
        
    }
}