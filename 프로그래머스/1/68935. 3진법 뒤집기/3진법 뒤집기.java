class Solution {
    public int solution(int n) {

        //3진법 변환
        String ternary = Integer.toString(n, 3);

        //앞뒤 반전
        String reversed = new StringBuilder(ternary).reverse().toString();

        //3->10진법 변환
        return  Integer.parseInt(reversed, 3);
    }
}
