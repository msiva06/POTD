package January;

import java.util.Arrays;

// House Robber
public class Problem_21 {
     public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo,-1);
        return robHouse(n-1,nums,memo);
    }

    public int robHouse(int idx, int[] nums,int[] memo){
        if(idx < 0)
            return 0;
        if(memo[idx] != -1)
            return memo[idx];
        int notRob = robHouse(idx-1,nums,memo);
        int rob = nums[idx];
        if(idx - 2 >= 0){
            rob += robHouse(idx-2,nums,memo);
        }
        return memo[idx] = Math.max(rob,notRob);
    }
}
