class Solution {
    public int[] solution(long n) {
        
        
        String nums = String.valueOf(n);
        String[] numArr = nums.split(""); 
                
        int[] answer = new int[numArr.length];
        
        int id = 0;    
        
        for(int i = numArr.length - 1; i >= 0; i--){
            answer[id++] = Integer.parseInt(numArr[i]);
        }
        
        return answer;
    }
}