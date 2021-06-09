class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return getSum(firstWord) + getSum(secondWord) == getSum(targetWord);        
    }
    
    private int getSum(String word){
        int sum = 0;
        for (int i=0; i<word.length(); i++){
            sum = sum * 10 + (word.charAt(i) - 'a');  
        }
        return sum;
    }
}