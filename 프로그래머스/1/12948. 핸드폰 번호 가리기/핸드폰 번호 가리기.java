class Solution {
    public String solution(String phone_number) {
        int maskedLength = phone_number.length() - 4;

        String answer = "*".repeat(maskedLength);        
        String backNum = phone_number.substring(maskedLength);

        return answer += backNum;
    }
}