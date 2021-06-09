class Solution {
    public String interpret(String command) {
        StringBuffer result = new StringBuffer();
        int i=0;
        
        while(i<command.length()){
            if (command.charAt(i) == 'G'){
                result.append("G");
                i++;
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                result.append("o");
                i = i+2;
            } else{
                result.append("al");
                i = i+4;
            }
        }
        
        return result.toString();
    }
}