class Solution {
    
    public String longestPalindrome(String s) {
        int len1, len2, len, start=0, end=0;
        String result = "";
        
        for (int i=0; i<s.length(); i++) {
            len1 = middleOut(s, i, i);
            len2 = middleOut(s, i, i+1);
            len = Math.max(len1, len2);
            
            if (len > end- start) {
                start = i - (len-1)/2;
                end = i+ len/2;
                result = s.substring(start, end+1);
            }
        }
        
        return result;
    }
    
    private int middleOut (String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left --;
            right++;
        }
        
        return right-left-1;
    }
}