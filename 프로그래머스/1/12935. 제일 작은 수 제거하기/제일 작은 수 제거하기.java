import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int minNum = arr[0];
        int index = 0;

        if (arr.length == 1) {
            int[] answerEmpty = new int[]{-1};
            return answerEmpty;
        }

        for (int i = 0; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
                index = i;
            }
        }

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) continue;
            answer[idx++] = arr[i];
        }
        
        return answer;
    }
}