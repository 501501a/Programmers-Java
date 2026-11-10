class Solution {
    public int solution(int n) {
        int[] fib = new int[n + 1];   // ① 0번~n번 칸이 있는 상자
        fib[0] = 0;                   // ② 앞 두 칸은 처음부터 알고 있음
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {                    // ③ 2번 칸부터 n번 칸까지
            fib[i] = (fib[i-1] + fib[i-2]) % 1234567;     // ④ 앞 칸 + 그 앞 칸, 바로 나머지로
        }
        return fib[n];                // ⑤ n번 칸이 답
    }
}