package February;

// Cherry Pickup
public class Problem_11 {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    dp[i][j][k] = - 1;
                }
            }
        }
        return count(0,0,n-1,dp,grid);
    }

    public int count(int row,int col1,int col2,int[][][] dp,int[][] grid){
        if(col1 < 0 || col1 >= grid[0].length || col2 < 0 || col2 >= grid[0].length)
            return 0;
        if(dp[row][col1][col2] != -1)
            return dp[row][col1][col2];
        int res = 0;
        res += grid[row][col1];
        if(col1 != col2){
            res += grid[row][col2];
        }

        if(row != grid.length-1){
            int max = 0;
            for(int i = col1-1; i <= col1 + 1; i++){
                for(int j = col2-1; j <= col2 + 1; j++){
                    max = Math.max(max,count(row+1,i,j,dp,grid));
                }
            }
            res += max;
        }
        dp[row][col1][col2]  = res;
        return res;
        
    }
}
