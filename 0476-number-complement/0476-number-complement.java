class Solution {
    public int findComplement(int n) {

        int ans = 0;
        int power = 1;
        while (n > 0) {
            int bit = n & 1;
            if (bit == 0) {
                ans = ans + power;
            }
            n = n >> 1;
            power = power * 2;
        }

        return ans;
    }
}