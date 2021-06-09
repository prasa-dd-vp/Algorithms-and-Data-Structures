class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int s1 = 0,
            s2 = 0,
            w1 = 0,
            w2 = 0;
        
        while(w1<word1.length && w2<word2.length) {
            String string1 = word1[w1];
            String string2 = word2[w2];
            
            if (string1.charAt(s1) != string2.charAt(s2)) return false;
            
            if (s1<word1[w1].length()-1){
                s1++;  
            } 
            else{
                s1 = 0;
                w1++;
            }
            
            if (s2<word2[w2].length()-1){
                s2++;  
            } 
            else{
                s2 = 0;
                w2++;
            }
        }
        
        return w1 == word1.length && w2 == word2.length;
    }
}