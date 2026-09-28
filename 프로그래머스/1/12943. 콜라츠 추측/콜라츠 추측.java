class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;

        while(n != 1 && count < 500){
            ++count;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return n == 1 ? count : -1;
    }
}