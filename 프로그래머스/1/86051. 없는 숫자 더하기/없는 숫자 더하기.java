import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> checkList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < checkList.size(); j++){
                if(numbers[i] == checkList.get(j)){
                    checkList.remove(j);
                }
            }
        }

        for (int i = 0; i < checkList.size(); i++){
            answer += checkList.get(i);
        }

        return answer;
    }
}