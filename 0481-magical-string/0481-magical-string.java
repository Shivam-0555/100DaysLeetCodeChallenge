class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        int[] magic = new int[n + 2];

        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;

        int head = 2;
        int tail = 3;
        int num = 1;
        int count = 1;

        while (tail < n) {
            int repeat = magic[head];

            for (int i = 0; i < repeat && tail < n; i++) {
                magic[tail] = num;

                if (num == 1) {
                    count++;
                }

                tail++;
            }

            num = (num == 1) ? 2 : 1;
            head++;
        }

        return count;
    }
}