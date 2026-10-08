class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        boolean isSuTurn = true;
        
        for(int i = 0; i < n; i++){
            if(isSuTurn){
                sb.append("수");
            } else {
                sb.append("박");
            }
            isSuTurn = !isSuTurn;
        }
        return sb.toString();
    }
}