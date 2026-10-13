class Solution {
    public boolean solution(String s) {
        System.out.println(s);
       int length = s.length();
        
        if(length != 4 && length != 6){
              return false;
        }
        
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}