package January;

import java.util.Arrays;

// Climbing stairs
public class Problem_17 {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return climb(n,memo);
    }

    public int climb(int n,int[] memo){
        if(n == 0)
            return 1;
        if(memo[n] != -1)
            return memo[n];
        int oneStep = climb(n-1,memo);
        int twoStep = 0;
        if(n >= 2){
            twoStep = climb(n-2,memo);
        }
        return memo[n] = oneStep + twoStep;
    }
}
