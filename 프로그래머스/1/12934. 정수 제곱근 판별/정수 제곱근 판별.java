class Solution {
    public long solution(long n) {
    double sqrt = Math.sqrt(n);
        long x = (long)sqrt;
        
        if(x * x == n){
            x++;
            return x * x;
        }
        
        return -1;
    }
}