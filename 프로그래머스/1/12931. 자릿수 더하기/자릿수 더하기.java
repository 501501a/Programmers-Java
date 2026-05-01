public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String numStr = String.valueOf(n);
        String[] digits = numStr.split("");
        
        for(String digit : digits){
            answer += Integer.parseInt(digit);
        }

        return answer;
    }
}