class Solution {
    
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        String result = "";
        int maxLen = 0;
        
        //Bottom-up
        for (int left=s.length()-1; left>=0; left--) {
            for (int right=left; right<s.length(); right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    
                    //True for length upto 3
                    if (right-left <= 2) {
                        dp[left][right] = true;
                    } else {
                        dp[left][right] = dp[left+1][right-1];
                    }
                }
                
                if (dp[left][right] && maxLen<right-left+1) {
                    result = s.substring(left, right+1);
                    maxLen = right-left+1;
                }
            }
        }
        return result;
    }
}