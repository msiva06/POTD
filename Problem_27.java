// Knight Dialer
public class Problem_27 {
    int mod = (int) 1e9+7;
    public int knightDialer(int n) {
        int[][] jumps = {
        {4,6},
        {6,8},
        {7,9},
        {4,8},
        {0,3,9},
        {},
        {0,1,7},
        {2,6},
        {1,3},
        {2,4}
        };
        
        int[][] memo = new int[n][10];
        for(int i = 0; i < 10; i++){
            memo[0][i] = 1;
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < 10;j++){
                int[] valid = jumps[j];
                int ans=0;
                for(int v : valid){
                    ans = (ans + memo[i-1][v]) % mod;
                }
                memo[i][j] = ans;
            }
        }
        int ans = 0;
        for(int i = 0; i < 10; i++){
            ans = (ans + memo[n-1][i]) % mod;
        }
        return ans;

        // for(int i = 0; i < memo.length; i++)
        //     Arrays.fill(memo[i],-1);
        // for(int i = 0; i < jumps.length; i++){
        //     ans = (ans + countWays(n-1,i,jumps,memo)) % mod;
        // }
        // return ans;
    }

    public int countWays(int remain,int digit,int[][] jumps,int[][] memo){
        if(remain == 0)
            return 1;
        if(memo[remain][digit] != -1)
            return memo[remain][digit];
        int[] valid = jumps[digit];
        int ans = 0;
        for(int v : valid){
            ans = (ans + countWays(remain-1,v,jumps,memo)) % mod;
        }
        memo[remain][digit] = ans;
        return memo[remain][digit];
    }
}
