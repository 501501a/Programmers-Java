class Solution {
    public String solution(String s) {
        boolean isEven = true;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                isEven = false;
            }
            
            if(isEven){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            isEven = !isEven;
        }
        return sb.toString();
    }
}