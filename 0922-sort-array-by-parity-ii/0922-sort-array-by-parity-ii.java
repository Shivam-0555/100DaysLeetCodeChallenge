class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int j = 1;  // Pointer for odd indices
        // Scan all even indices
        for (int i = 0; i < n; i += 2) {     
            // If even index has even number, it's correct
            if (nums[i] % 2 == 0) continue; 
            // If even index has odd number, find an even number at odd index
            while (nums[j] % 2 != 0) {
                j += 2;
            } 
            // Swap: even number from odd index goes to even index
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        return nums;
    }
}