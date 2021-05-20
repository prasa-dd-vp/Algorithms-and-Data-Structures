class Solution {
    public String reverseWords(String s) {
        char[] stringArr = s.toCharArray();
        
        reverseString(stringArr, 0, s.length()-1);  //Reverse the entire string
        reverseTheWords(stringArr);                 //Reverse word by word
        return trimSpaces(stringArr);               //Remove the extra spaces
    }
    
    //To reverse a string given a start and end
    private void reverseString(char[] arr, int start, int end) {
        char temp;
        while(start<end){
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    
    private void reverseTheWords(char[] arr){
        int i=0, j=0, n=arr.length;
        while(i<n){
            while(i<n && arr[i]==' ') i++;  //Skip spaces
            j = i;
            while(j<n && arr[j]!=' ') j++;  //Skip non spaces
            reverseString(arr, i, j-1);     //Reverse the string between i and j
            i = j++;
        }
    }
    
    private String trimSpaces(char[] arr){
        int i=0, j=0, n=arr.length;
        while(j<n){
            while(j<n && arr[j]==' ') j++;                  //Skip spaces
            while(j<n && arr[j]!=' ') arr[i++] = arr[j++];  //Shift characters
            while(j<n && arr[j]==' ') j++;                  //Skip spaces
            if(j<n) arr[i++] = ' ';                         //Leave one space after a word
        }
        return new String(arr).substring(0,i);
    }
}