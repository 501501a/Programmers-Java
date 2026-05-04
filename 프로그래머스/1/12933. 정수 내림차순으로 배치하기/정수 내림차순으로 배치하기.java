class Solution {
    public long solution(long n) {

        //long to String
        String numStr = String.valueOf(n);
        
        //String to String[]
        String[] numArr = numStr.split("");

        //String[] to int[]
        int[] digits = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            digits[i] = Integer.parseInt(numArr[i]);
        }

        // 내림차순 버블 정렬
        int temp = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length - 1; j++) {
                if (digits[j] < digits[j + 1]) {
                    temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j + 1] = temp;
                }
            }
        }

        //int[] to String
        StringBuilder merge = new StringBuilder();
        for (int digit : digits) {
            merge.append(digit);
        }

        //String to long
        return Long.parseLong(merge.toString());
    }
}
