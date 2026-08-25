class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> map = new HashSet<>();
        for(int num : nums){
            map.add(num);
        }
        int curr = k;
        while(map.contains(curr)){
            curr += k;
        }
        return curr;
    }
}