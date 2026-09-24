class Solution {
    public int climbStairs(int n) {
        if (n<=2) return n;
        int s1 = 2;
        int s2 = 1;
        int current = 0;

        for(int i = 3; i<= n; i++){
          current = s1 + s2;
          s2 = s1;
          s1= current;
        }
      return current;
        
    }
}