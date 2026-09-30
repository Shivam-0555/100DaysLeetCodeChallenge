class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) sum += nums[i];
        int j = n - k;
        int sum2 = 0;
        for (int i = 0; i < j; i++) sum2 += nums[i];
        int min = sum2;
        for (int i = 0; i < k; i++) {
            sum2 -= nums[i];
            sum2 += nums[j + i];
            if (sum2 < min) min = sum2;
        }
        return sum - min;
    }
}