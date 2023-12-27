package December;

// Number of dice rolls with target sum
public class Problem_27 {
    final int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
         Integer[][] memo = new Integer[n+1][target+1];
        return countRolls(n,target,k,memo);
    }

    public int countRolls(int n,int target,int k,Integer[][] memo){
        
        if(n == 0){
            return target == 0 ? 1 : 0;
        }
        if(memo[n][target] != null)
            return memo[n][target];
        int count = 0;
        for(int i = 1; i <= k; i++){
            if(i <= target)
                count = (count + countRolls(n-1,target-i,k,memo)) % MOD;
        }
        return memo[n][target] = count;
    }
}
