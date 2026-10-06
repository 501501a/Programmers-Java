class Solution {
    public String solution(String s) {
        int mid = s.length() / 2;
        
        if(s.length() % 2 == 0){
            //짝수
            return s.substring(mid -1, mid +1);

        }
        //홀수
        return s.substring(mid, mid+1);
    }
}