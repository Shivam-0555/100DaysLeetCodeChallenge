class Solution {
    public boolean sumGame(String s) {
        int n = s.length();
        int a = 0, b = 0, x = 0, y = 0;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == '?') x++;
            else a += s.charAt(i) - '0';
        }

        for (int i = n / 2; i < n; i++) {
            if (s.charAt(i) == '?') y++;
            else b += s.charAt(i) - '0';
        }
        if ((x + y) % 2 == 1)
            return true;

        return a - b != 9 * (y - x) /2;
    }
}