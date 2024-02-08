package February;

import java.util.Arrays;

// Perfect squares
public class Problem_08 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j <= i; j++){
                int sq = j * j;
                if(sq > i){
                    break;  
                }
                dp[i] = Math.min(dp[i],1+dp[i-sq]);
            }

        }
        return dp[n];
    }
}
