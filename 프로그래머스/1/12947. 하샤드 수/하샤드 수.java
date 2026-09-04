class Solution {
    public boolean solution(int x) {       
        String num = x + "";
        int sum = 0;
        
        for(int i = 0; i < num.length();i++){
            String digit = "" + num.charAt(i);
            sum += Integer.parseInt(digit);
        }

        return x % sum ==0;
    }
}