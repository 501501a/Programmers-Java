class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                //그대로 추가
                sb.append(c);
                continue;
            }
            char base = Character.isUpperCase(c) ? 'A':'a';
                // 0~25 위치로 -> n 더하고 %26
                int shiftedIndex = (c - base + n) % 26;
                // -> 복원
                char encrypted = (char)(shiftedIndex + base);
                sb.append(encrypted);
        }
        return sb.toString();
    }
}