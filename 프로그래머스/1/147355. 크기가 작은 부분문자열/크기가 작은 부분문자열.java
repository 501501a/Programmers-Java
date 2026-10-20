class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        long target = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - length; i++){
            String slice = t.substring(i,i+length);
            long value = Long.parseLong(slice);
            
            if (value <= target){
                ++answer;
            }
        }
        return answer;
    }
}