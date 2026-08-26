class Solution {
    public int alternateDigitSum(int n) {

        String s = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {

            int dgt = s.charAt(i) - '0';
            if(i % 2 == 0) {
                sum = sum + dgt;
            } else {
                sum = sum - dgt;
            }
        }

        return sum;
    }
}