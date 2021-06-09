class Solution {
    public boolean checkIfPangram(String sentence) {
        int seen = 0;
        int charInd;
        
        for (int i=0; i<sentence.length(); i++){
            charInd = sentence.charAt(i) - 'a';
            seen = seen | 1<<charInd;
        }
        
        return seen == ((1<<26) - 1);
    }
}