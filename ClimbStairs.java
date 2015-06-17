public class Solution {
    public int climbStairs(int n) {
        /*
        if(n == 0) return 1;
        if(n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
        */
        int[] result = new int[n+1];
        if(n >= 0) result[0] = 1;
        if(n >= 1) result[1] = 1;
         for(int i = 2; i <= n; i ++) {
             result[i] = result[i-1] + result[i-2];
         }
         return result[n];
    }
}