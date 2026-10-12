import java.util.*;

class Solution {
    public String solution(String s) {
        
        ArrayList<Character> orderList = new ArrayList<>(s.length());
        
        for(int i = 0; i < s.length(); i++){
            orderList.add(s.charAt(i));
        }
        Collections.sort(orderList, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < orderList.size(); i++){
            sb.append(orderList.get(i));
        }
        return sb.toString();
    }
}