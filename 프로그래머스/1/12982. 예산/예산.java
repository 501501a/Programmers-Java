import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int used = 0;
        int count = 0;
        
        for(int cost : d){
            if(used + cost > budget){
                break;
            }
            used += cost;
            count++;
        }
        return count;
    }
}