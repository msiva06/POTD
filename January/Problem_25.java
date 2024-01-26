package January;

import java.util.Arrays;

// Out of boundary paths
public class Problem_25 {
    int mod = 1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] memo = new int[m][n][maxMove+1];
        for(int i = 0; i < memo.length; i++){
            for(int j = 0; j < memo[i].length; j++){
                Arrays.fill(memo[i][j],-1);
            }
        }
        return count(m,n,maxMove,startRow,startColumn,memo);
    }

    public int count(int m,int n, int maxi,int sr, int sc,int[][][] memo){
        if(sr < 0 || sc < 0 || sr >= m || sc >= n)
            return 1;
        if(maxi == 0)
            return 0;
        if(memo[sr][sc][maxi] >= 0)
            return memo[sr][sc][maxi];
        return memo[sr][sc][maxi] = ((count(m,n,maxi-1,sr,sc-1,memo)  + count(m,n,maxi-1,sr-1,sc,memo)) % mod
            +(count(m,n,maxi-1,sr+1,sc,memo)  +count(m,n,maxi-1,sr,sc+1,memo)) % mod) % mod;
        
    }
}
