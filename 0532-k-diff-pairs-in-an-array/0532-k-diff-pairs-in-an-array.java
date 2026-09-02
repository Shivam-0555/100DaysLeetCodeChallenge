class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> p = new HashSet<>();
        for(int n :nums){
         if(set.contains(n - k)){
            p.add(n);
         }
          if(set.contains(n + k)){
            p.add(n+k);
         }
         set.add(n);
        }
        
      return p.size();
    }
}