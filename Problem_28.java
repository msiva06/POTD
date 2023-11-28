import java.util.Arrays;

// Number of ways to divide a long corridor
public class Problem_28 {
    int mod = (int) 1e9+7;
    public int numberOfWays(String corridor) {
        // int lastIndex = 0,chairs = 0;
        // long ans = 1l;
        // for(int i = 0; i < corridor.length(); i++){
        //     if(corridor.charAt(i) == 'S'){
        //         chairs++;
        //         if(chairs %2 == 0)
        //         {
        //             lastIndex = i;
        //         }
        //         else if(chairs % 2 == 1 && chairs > 2){
        //             ans *= (i - lastIndex);
        //             ans %= mod;
        //         }
        //     }
            
        // }
        // if(chairs % 2 != 0 || lastIndex == 0)
        //     ans = 0;
        // return (int)ans;
        int n = corridor.length();
        int [][] memo = new int[n][3];
        for(int i = 0; i < n; i++)
            Arrays.fill(memo[i],-1);
        return count(0,0,corridor,memo);
    }

    public int count(int idx,int seat,String corridor,int[][] memo){
        if(idx == corridor.length())
        {
            if(seat == 2)
                return 1;
            return 0;
        }
        if(memo[idx][seat] != -1)
            return memo[idx][seat];
        int res = 0;
        if(corridor.charAt(idx) == 'S'){
            if(seat == 2){
                res = count(idx+1,1,corridor,memo);
            }
            else{
                res = count(idx+1,seat+1,corridor,memo);
            }
        }
        else if(corridor.charAt(idx) == 'P'){
            if(seat == 2){
                res = (count(idx+1,0,corridor,memo) + count(idx+1,2,corridor,memo)) % mod;
            }
            else{
                res =count(idx+1,seat,corridor,memo);
            }
        }
        return  memo[idx][seat] = res;
    }
}
