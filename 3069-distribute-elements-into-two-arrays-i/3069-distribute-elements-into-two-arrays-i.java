class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int i1 = 0, i2 = 0;
        // First two elements
        arr1[i1++] = nums[0];
        arr2[i2++] = nums[1];

        // Remaining elements
        for (int i = 2; i < n; i++) {
            if (arr1[i1 - 1] > arr2[i2 - 1]) {
                arr1[i1++] = nums[i];
            } else {
                arr2[i2++] = nums[i];
            }
        }

        // Result = arr1 + arr2
        int[] result = new int[n];

        for (int i = 0; i < i1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < i2; i++) {
            result[i1 + i] = arr2[i];
        }

        return result;
    }
}