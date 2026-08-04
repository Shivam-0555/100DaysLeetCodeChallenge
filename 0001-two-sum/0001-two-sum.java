import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i =0; i<n; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                return new int[]{map.get(c),i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}