class Solution {
    public int bitwiseComplement(int n) {

        if (n == 0) {
            return 1;
        }
        int rst = 0;
        int pwt = 1;

        while (n > 0) {
            int bit = n & 1;

            if (bit == 0) {
                rst = rst + pwt;
            }
            n = n >> 1;
            pwt = pwt * 2;
        }
        return rst;
    }
}